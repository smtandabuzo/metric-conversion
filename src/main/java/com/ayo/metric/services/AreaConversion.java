package com.ayo.metric.services;

public class AreaConversion implements MetricConversion{

    @Override
	public Double convertToMetric(Double value) {
		return value/2.471;
	}

	@Override
	public Double convertToImperial(Double value) {
		return value*2.471;
	}
    
}
