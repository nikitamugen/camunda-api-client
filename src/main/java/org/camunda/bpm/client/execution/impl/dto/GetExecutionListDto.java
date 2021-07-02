package org.camunda.bpm.client.execution.impl.dto;

import java.util.List;
import java.util.Map;
import lombok.Builder;
import lombok.Data;
import org.camunda.bpm.client.variable.impl.TypedValueField;

@Data
@Builder
public class GetExecutionListDto {

    private String businessKey;
    private String processDefinitionId;
    private String processDefinitionKey;
    private String processInstanceId;
    private String activityId;
    private String signalEventSubscriptionName;
    private String messageEventSubscriptionName;
    private String active;
    private String suspended;
    private String incidentId;
    private String incidentType;
    private String incidentMessage;
    private String incidentMessageLike;
    private List<String> tenantIdIn;
    private Map<String, TypedValueField> variables;
    private Map<String, TypedValueField> processVariables;
    private boolean variableNamesIgnoreCase;
    private boolean variableValuesIgnoreCase;
}
