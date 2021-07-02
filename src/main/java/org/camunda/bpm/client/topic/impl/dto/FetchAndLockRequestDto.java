package org.camunda.bpm.client.topic.impl.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.util.List;
import org.camunda.bpm.client.impl.ExternalTaskRequestDto;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FetchAndLockRequestDto extends ExternalTaskRequestDto {

    protected int maxTasks;
    protected boolean usePriority;
    protected Long asyncResponseTimeout;
    protected List<TopicRequestDto> topics = new ArrayList<>();

    public FetchAndLockRequestDto(String workerId, int maxTasks, Long asyncResponseTimeout,
        List<TopicRequestDto> topics) {
        this(workerId, maxTasks, asyncResponseTimeout, topics, true);
    }

    public FetchAndLockRequestDto(String workerId, int maxTasks, Long asyncResponseTimeout,
        List<TopicRequestDto> topics, boolean usePriority) {
        super(workerId);
        this.maxTasks = maxTasks;
        this.usePriority = usePriority;
        this.asyncResponseTimeout = asyncResponseTimeout;
        this.topics = topics;
    }

    public int getMaxTasks() {
        return maxTasks;
    }

    public boolean isUsePriority() {
        return usePriority;
    }

    public List<TopicRequestDto> getTopics() {
        return topics;
    }

    public Long getAsyncResponseTimeout() {
        return asyncResponseTimeout;
    }

}
