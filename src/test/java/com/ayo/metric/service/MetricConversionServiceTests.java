package com.ayo.metric.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.ayo.metric.services.MetricConversion;
import com.ayo.metric.services.MetricConversionFactory;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MetricConversionServiceTests {
    @Test
	void testGetConversionToMetric() throws Exception {
		MetricConversionFactory factory = new MetricConversionFactory();
		MetricConversion fromFactory = factory.getConversion("length");
		assertThat(fromFactory.convertToMetric(15.0)).isEqualTo(24.134999999999998);
	}
	
	@Test
	void testGetConversionToImperial() throws Exception {
		MetricConversionFactory factory = new MetricConversionFactory();
		MetricConversion fromFactory = factory.getConversion("length");
		assertThat(fromFactory.convertToImperial(10.0)).isEqualTo(6.215040397762586);
	}
}
