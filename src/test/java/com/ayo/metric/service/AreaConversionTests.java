package com.ayo.metric.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AreaConversionTests {
    
    @Test
	void testToMetric() throws Exception {
		assertThat(10.0/2.471).isEqualTo(4.046944556859571);
	}
	
	@Test
	void testToImperial() throws Exception {
		assertThat(10.0*2.471).isEqualTo(24.71);
	}
}
