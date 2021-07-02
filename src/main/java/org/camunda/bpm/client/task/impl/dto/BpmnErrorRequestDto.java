package org.camunda.bpm.client.task.impl.dto;

import java.util.Map;
import org.camunda.bpm.client.impl.ExternalTaskRequestDto;
import org.camunda.bpm.client.variable.impl.TypedValueField;

public class BpmnErrorRequestDto extends ExternalTaskRequestDto {

    protected String errorCode;
    protected String errorMessage;
    protected Map<String, TypedValueField> variables;

    public BpmnErrorRequestDto(String workerId, String errorCode) {
        super(workerId);
        this.errorCode = errorCode;
    }

    public BpmnErrorRequestDto(String workerId, String errorCode, String errorMessage) {
        this(workerId, errorCode);
        this.errorMessage = errorMessage;
    }

    public BpmnErrorRequestDto(String workerId, String errorCode, String errorMessage,
        Map<String, TypedValueField> variables) {
        this(workerId, errorCode, errorMessage);
        this.variables = variables;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public Map<String, TypedValueField> getVariables() {
        return variables;
    }
}
