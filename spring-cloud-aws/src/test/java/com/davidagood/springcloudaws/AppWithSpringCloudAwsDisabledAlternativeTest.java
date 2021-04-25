package com.davidagood.springcloudaws;

import io.awspring.cloud.messaging.listener.SimpleMessageListenerContainer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test-alt") // See src/test/resource/application.yml
class AppWithSpringCloudAwsDisabledAlternativeTest {

	@MockBean
	SimpleMessageListenerContainer simpleMessageListenerContainer;

	@Test
	void validateSpringBootTestRunsWithSpringCloudAwsDisabled() {
	}

}
