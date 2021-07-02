package org.camunda.bpm.client.message.impl.dto;

import java.util.Map;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.camunda.bpm.client.variable.impl.TypedValueField;

@Getter
@NoArgsConstructor
public class CorrelateResultDto {

    private String resultType;
    private ProcessInstanceDto processInstance;
    private ExecutionDto execution;
    private Map<String, TypedValueField> processVariables;
}
