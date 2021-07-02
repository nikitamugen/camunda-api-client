package org.camunda.bpm.client.message.impl.dto;

import lombok.Data;

@Data
public class ExecutionDto {

    private String id;
    private String processInstanceId;
    private boolean ended;
    private String tenantId;
}
