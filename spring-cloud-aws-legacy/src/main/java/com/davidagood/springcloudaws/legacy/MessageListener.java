package com.davidagood.springcloudaws.legacy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MessageListener {

    @SqsListener(value = "${app.sqs-queue-name}", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void handleMessage(Payload payload) {
        log.info("Received message: {}", payload);
    }
}
