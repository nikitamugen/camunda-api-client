package org.camunda.bpm.client.task.impl.dto;

import java.util.Map;
import org.camunda.bpm.client.impl.ExternalTaskRequestDto;
import org.camunda.bpm.client.variable.impl.TypedValueField;

public class FailureRequestDto extends ExternalTaskRequestDto {

    protected String errorMessage;
    protected String errorDetails;
    protected int retries;
    protected long retryTimeout;
    protected Map<String, TypedValueField> variables;
    protected Map<String, TypedValueField> localVariables;

    public FailureRequestDto(String workerId, String errorMessage, String errorDetails, int retries, long retryTimeout,
        Map<String, TypedValueField> variables, Map<String, TypedValueField> localVariables) {
        super(workerId);
        this.errorMessage = errorMessage;
        this.errorDetails = errorDetails;
        this.retries = retries;
        this.retryTimeout = retryTimeout;
        this.variables = variables;
        this.localVariables = localVariables;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getErrorDetails() {
        return errorDetails;
    }

    public int getRetries() {
        return retries;
    }

    public long getRetryTimeout() {
        return retryTimeout;
    }

    public Map<String, TypedValueField> getVariables() {
        return variables;
    }

    public Map<String, TypedValueField> getLocalVariables() {
        return localVariables;
    }

}
