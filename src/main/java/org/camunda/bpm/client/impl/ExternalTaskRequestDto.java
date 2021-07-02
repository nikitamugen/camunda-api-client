package org.camunda.bpm.client.impl;

public abstract class ExternalTaskRequestDto {
    protected String workerId;

    public ExternalTaskRequestDto(String workerId) {
        this.workerId = workerId;
    }

    public String getWorkerId() {
        return workerId;
    }
}
