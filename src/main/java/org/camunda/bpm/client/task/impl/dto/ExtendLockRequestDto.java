package org.camunda.bpm.client.task.impl.dto;

import org.camunda.bpm.client.impl.ExternalTaskRequestDto;

public class ExtendLockRequestDto extends ExternalTaskRequestDto {

    protected long newDuration;

    public ExtendLockRequestDto(String workerId, long newDuration) {
        super(workerId);
        this.newDuration = newDuration;
    }

    public long getNewDuration() {
        return newDuration;
    }

}
