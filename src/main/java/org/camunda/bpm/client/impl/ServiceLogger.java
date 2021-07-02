package org.camunda.bpm.client.impl;

import java.io.IOException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.camunda.bpm.client.exception.ConnectionLostException;
import org.camunda.bpm.client.exception.ExternalTaskClientException;
import org.camunda.bpm.client.exception.NotAcquiredException;
import org.camunda.bpm.client.exception.NotResumedException;
import org.camunda.bpm.client.exception.UnknownHttpErrorException;
import org.camunda.commons.logging.BaseLogger;

public class ServiceLogger extends BaseLogger {

    protected static final String PROJECT_CODE = "API/CLIENT";
    protected static final String PROJECT_LOGGER = "pro.sisit";

    public static final ServiceLogger MESSAGE_SERVICE_LOGGER =
        createLogger(ServiceLogger.class, PROJECT_CODE, PROJECT_LOGGER, "message-service");

    public ExternalTaskClientException messageServiceException(String actionName, EngineClientException e) {
        Throwable causedException = e.getCause();

        if (causedException instanceof HttpResponseException) {
            switch (((HttpResponseException) causedException).getStatusCode()) {
                case 400:
                    return new NotAcquiredException(exceptionMessage(
                        "message-1",
                        "Exception while {}: no message was supplied. Or the message has not been correlated to exactly one entity (execution or process definition), or the variable value or type is invalid",
                        actionName));
                case 500:
                    String processEngineError = e.getCause().getMessage();
                    String exceptionReason =
                        (processEngineError != null && !processEngineError.isEmpty()) ? " Reason: " + processEngineError
                            : "";
                    return new NotResumedException(exceptionMessage(
                        "message-2", "Exception while {}: The corresponding process instance could not be resumed.{}",
                        actionName, exceptionReason), processEngineError);
                default:
                    int statusCode = ((HttpResponseException) causedException).getStatusCode();
                    return new UnknownHttpErrorException(exceptionMessage(
                        "message-3",
                        "Exception while performing an HTTP Request. The request failed with status code: {}.",
                        statusCode));
            }
        }

        if (causedException instanceof ClientProtocolException || causedException instanceof IOException) {
            return new ConnectionLostException(exceptionMessage(
                "010", "Exception while {}: Connection could not be established", actionName));
        }

        return new ExternalTaskClientException(exceptionMessage(
            "011", "Exception while {}: ", actionName), e);
    }
}
