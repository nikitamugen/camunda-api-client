package org.camunda.bpm.client.impl;

import lombok.AllArgsConstructor;
import org.camunda.bpm.client.task.ExternalTaskService;
import org.camunda.bpm.client.MessageService;

@AllArgsConstructor
public class Context {

    private static Context contextInstance;

    public static void initContext(ExternalTaskService externalTaskService, MessageService messageService) {
        contextInstance = new Context(externalTaskService, messageService);
    }

    public static ExternalTaskService getExternalTaskService() {
        return contextInstance.externalTaskService;
    }

    public static MessageService getMessageService() {
        return contextInstance.messageService;
    }

    private ExternalTaskService externalTaskService;
    private MessageService messageService;
}
