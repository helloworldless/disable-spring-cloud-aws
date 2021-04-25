package com.davidagood.springcloudaws.legacy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.cloud.aws.messaging.listener.SimpleMessageListenerContainer;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test-alt") // See src/test/resource/application.yml
class AppLegacyWithSpringCloudAwsDisabledAlternativeTest {

	@MockBean
	SimpleMessageListenerContainer simpleMessageListenerContainer;

	@Test
	void validateSpringBootTestRunsWithSpringCloudAwsDisabled() {
	}

}
