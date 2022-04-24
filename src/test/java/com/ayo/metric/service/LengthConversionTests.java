package com.ayo.metric.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LengthConversionTests {
    @Test
	void testToMetric() throws Exception {
		assertThat(15.0*1.609).isEqualTo(24.134999999999998);
	}
	
	@Test
	void testToImperial() throws Exception {
		assertThat(10.0/1.609).isEqualTo(6.215040397762586);
	}
}
