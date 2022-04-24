package com.ayo.metric.service;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TemperatureConversionTests {
    @Test
	void testToMetric() throws Exception {
		assertThat(((89.6-32)*5)/9).isEqualTo(32);
	}
	
	@Test
	void testToImperial() throws Exception {
		assertThat(((32.0*9)/5)+32).isEqualTo(89.6);
	}
}
