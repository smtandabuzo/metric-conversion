package com.ayo.metric.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class WeightConversionTests {
    @Test
	void testToMetric() throws Exception {
		assertThat(10.0/2.205).isEqualTo(4.535147392290249);
	}
	
	@Test
	void testToImperial() throws Exception {
		assertThat(10.0*2.205).isEqualTo(22.05);
	}
}
