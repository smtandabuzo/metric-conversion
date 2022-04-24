package com.ayo.metric.services;

public class WeightConversion implements MetricConversion{
    @Override
	public Double convertToMetric(Double value) {
		return value/2.205;
	}

	@Override
	public Double convertToImperial(Double value) {
		return value*2.205;
	}
}
