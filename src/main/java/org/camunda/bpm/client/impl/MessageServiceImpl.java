package org.camunda.bpm.client.impl;

import org.camunda.bpm.client.message.impl.dto.CorrelateDto;
import org.camunda.bpm.client.message.impl.dto.CorrelateResultDto;
import org.camunda.bpm.client.MessageService;

public class MessageServiceImpl implements MessageService {

    protected static final ServiceLogger LOG = ServiceLogger.MESSAGE_SERVICE_LOGGER;

    private final String baseUrl;
    private final RequestExecutor requestExecutor;

    public MessageServiceImpl(String baseUrl, RequestExecutor requestExecutor) {
        this.baseUrl = baseUrl;
        this.requestExecutor = requestExecutor;
    }

    @Override
    public CorrelateResultDto correlate(CorrelateDto correlateDto) {
        try {
            return requestExecutor.postRequest(baseUrl + "/message", correlateDto, CorrelateResultDto.class);
        } catch (EngineClientException e) {
            throw LOG.messageServiceException("correlating message", e);
        }
    }
}
