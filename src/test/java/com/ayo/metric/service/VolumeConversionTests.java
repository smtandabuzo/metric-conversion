package com.ayo.metric.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class VolumeConversionTests {
    @Test
	void testToMetric() throws Exception {
		assertThat(10.0*3.785).isEqualTo(37.85);
	}
	
	@Test
	void testToImperial() throws Exception {
		assertThat(10.0/3.785).isEqualTo(2.642007926023778);
	}
}
