package com.ayo.metric.service;

import com.ayo.metric.services.AreaConversion;
import com.ayo.metric.services.LengthConversion;
import com.ayo.metric.services.MetricConversion;
import com.ayo.metric.services.MetricConversionFactory;
import com.ayo.metric.services.TemperatureConversion;
import com.ayo.metric.services.VolumeConversion;
import com.ayo.metric.services.WeightConversion;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@SpringBootTest
public class MetricConversionFactoryTests {

    @Test
	void testGetConversionForLength() throws Exception {
		MetricConversionFactory factory = new MetricConversionFactory();
		MetricConversion fromFactory = factory.getConversion("length");
		assertThat(fromFactory.getClass().getName()).isEqualTo(LengthConversion.class.getName());
	}
	
	@Test
	void testGetConversionForArea() throws Exception {
		MetricConversionFactory factory = new MetricConversionFactory();
		MetricConversion fromFactory = factory.getConversion("area");
		assertThat(fromFactory.getClass().getName()).isEqualTo(AreaConversion.class.getName());
	}

	@Test
	void testGetConversionForWeight() throws Exception {
		MetricConversionFactory factory = new MetricConversionFactory();
		MetricConversion fromFactory = factory.getConversion("weight");
		assertThat(fromFactory.getClass().getName()).isEqualTo(WeightConversion.class.getName());
	}
	
	@Test
	void testGetConversionForVolume() throws Exception {
		MetricConversionFactory factory = new MetricConversionFactory();
		MetricConversion fromFactory = factory.getConversion("volume");
		assertThat(fromFactory.getClass().getName()).isEqualTo(VolumeConversion.class.getName());
	}
	
	@Test
	void testGetConversionForTemperature() throws Exception {
		MetricConversionFactory factory = new MetricConversionFactory();
		MetricConversion fromFactory = factory.getConversion("temperature");
		assertThat(fromFactory.getClass().getName()).isEqualTo(TemperatureConversion.class.getName());
	}
	
	@Test
	void testGetConversionForInvalidCategory() throws Exception {
		ResponseStatusException exception = new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Category of Conversion <abc>");
		MetricConversionFactory factory = new MetricConversionFactory();
		try {
			factory.getConversion("abc");
		} catch (Exception e) {
			assertEquals(e.getMessage(), exception.getMessage());
			assertEquals(((ResponseStatusException) e).getStatus(), exception.getStatus());
		}
	}
    
}
