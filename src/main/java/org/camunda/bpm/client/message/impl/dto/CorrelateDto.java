package org.camunda.bpm.client.message.impl.dto;

import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.camunda.bpm.client.impl.RequestDto;
import org.camunda.bpm.client.variable.impl.TypedValueField;

@Getter
@Builder
@AllArgsConstructor
public class CorrelateDto extends RequestDto {

    private String messageName;
    private String businessKey;
    private String tenantId;
    private boolean withoutTenantId;
    private String processInstanceId;
    private Map<String, TypedValueField> correlationKeys;
    private Map<String, TypedValueField> localCorrelationKeys;
    private Map<String, TypedValueField> processVariables;
    private Map<String, TypedValueField> processVariablesLocal;
    private boolean all;
    private boolean resultEnabled;
    private boolean variablesInResultEnabled;
}
