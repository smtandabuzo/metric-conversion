package com.ayo.metric.services;

public class LengthConversion implements MetricConversion{
    @Override
	public Double convertToMetric(Double value) {
		return 1.609*value;
	}

	@Override
	public Double convertToImperial(Double value) {
		return value/1.609;
	}
}
