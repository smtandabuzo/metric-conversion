package com.ayo.metric.services;

public class VolumeConversion implements MetricConversion{
    @Override
	public Double convertToMetric(Double value) {
		return value*3.785;
	}

	@Override
	public Double convertToImperial(Double value) {
		return value/3.785;
	}
}
