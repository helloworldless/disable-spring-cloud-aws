package com.davidagood.springcloudaws;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import io.awspring.cloud.messaging.core.QueueMessagingTemplate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("!(local | test | test-alt)")
@RequiredArgsConstructor
@Slf4j
public class SendMessageOnStartup implements CommandLineRunner {

    private final QueueMessagingTemplate queueMessagingTemplate;

    @Value("${app.sqs-queue-name}")
    private String queueName;

    @Autowired
    public SendMessageOnStartup(AmazonSQSAsync amazonSQSAsync) {
        this.queueMessagingTemplate = new QueueMessagingTemplate(amazonSQSAsync);
    }

    @Override
    public void run(String... args) {
        var payload = Payload.builder()
                .city("Anchorage")
                .state("AK")
                .build();
        log.info("Sending message to queueName={}: Message: {}", queueName, payload);
        this.queueMessagingTemplate.convertAndSend(queueName, payload);
    }
}
