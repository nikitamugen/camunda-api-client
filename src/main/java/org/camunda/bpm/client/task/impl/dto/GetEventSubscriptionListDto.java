package org.camunda.bpm.client.task.impl.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.camunda.bpm.client.impl.RequestDto;

@Data
@Builder
public class GetEventSubscriptionListDto extends RequestDto {

    private String eventSubscriptionId;
    private String eventName;
    private String eventType;
    private String executionId;
    private String processInstanceId;
    private String activityId;
    private String tenantIdIn;
    private boolean withoutTenantId;
    private boolean includeEventSubscriptionsWithoutTenantId;
    private String sortBy;
    private String sortOrder;
    private int firstResult;
    private int maxResults;
}
