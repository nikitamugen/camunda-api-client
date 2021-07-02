package org.camunda.bpm.client.task.impl.dto;

import org.camunda.bpm.client.impl.ExternalTaskRequestDto;

public class LockRequestDto extends ExternalTaskRequestDto {

    protected long lockDuration;

    public LockRequestDto(String workerId, long lockDuration) {
        super(workerId);
        this.lockDuration = lockDuration;
    }

    public long getLockDuration() {
        return lockDuration;
    }

}
