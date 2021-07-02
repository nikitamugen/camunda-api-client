package org.camunda.bpm.client.task.impl.dto;

import java.util.Map;
import org.camunda.bpm.client.impl.ExternalTaskRequestDto;
import org.camunda.bpm.client.variable.impl.TypedValueField;

public class CompleteRequestDto extends ExternalTaskRequestDto {

    protected Map<String, TypedValueField> variables;
    protected Map<String, TypedValueField> localVariables;

    public CompleteRequestDto(String workerId, Map<String, TypedValueField> variables,
        Map<String, TypedValueField> localVariables) {
        super(workerId);

        this.variables = variables;
        this.localVariables = localVariables;
    }

    public Map<String, TypedValueField> getVariables() {
        return variables;
    }

    public Map<String, TypedValueField> getLocalVariables() {
        return localVariables;
    }

}
