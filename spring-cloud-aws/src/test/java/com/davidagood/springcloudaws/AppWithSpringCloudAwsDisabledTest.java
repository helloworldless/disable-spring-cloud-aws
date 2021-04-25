package com.davidagood.springcloudaws;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // See src/test/resource/application.yml
class AppWithSpringCloudAwsDisabledTest {

	@Test
	void validateSpringBootTestRunsWithSpringCloudAwsDisabled() {
	}

}
