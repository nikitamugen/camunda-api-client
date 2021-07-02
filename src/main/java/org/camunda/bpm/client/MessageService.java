package org.camunda.bpm.client;

import org.camunda.bpm.client.message.impl.dto.CorrelateDto;
import org.camunda.bpm.client.message.impl.dto.CorrelateResultDto;

public interface MessageService {
    CorrelateResultDto correlate(CorrelateDto correlateDto);
}
