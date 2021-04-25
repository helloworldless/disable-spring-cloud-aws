package com.davidagood.springcloudaws.legacy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test") // See src/test/resource/application.yml
class AppLegacyWithSpringCloudAwsDisabledTest {

	@Test
	void validateSpringBootTestRunsWithSpringCloudAwsDisabled() {
	}

}
