package com.ayo.metric.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MetricConversionService {
    @Autowired
	MetricConversionFactory metricConversionFactory;
	
	public Double getConversion(String type, String toUnit, Double value) {
		MetricConversion conversion =	metricConversionFactory.getConversion(type);
		if(toUnit.equalsIgnoreCase("IMPERIAL")) {
			return conversion.convertToImperial(value);
		} else if(toUnit.equalsIgnoreCase("METRIC")){
			return conversion.convertToMetric(value);
		} else {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid Conversion System <" + toUnit + ">");
		}
	}
}
