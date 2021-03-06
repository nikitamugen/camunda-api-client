package org.camunda.bpm.client.message.impl.dto;

import lombok.Data;

@Data
public class ProcessInstanceDto {

    private String id;
    private String definitionId;
    private String businessKey;
    private String caseInstanceId;
    private boolean ended;
    private boolean suspended;
    private String tenantId;
}
