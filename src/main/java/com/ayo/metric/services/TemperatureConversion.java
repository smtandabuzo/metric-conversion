package com.ayo.metric.services;

public class TemperatureConversion implements MetricConversion{

    @Override
    public Double convertToMetric(Double value) {
        return ((value-32)*5)/9;
    }

    @Override
    public Double convertToImperial(Double value) {
        return ((value*9)/5)+32;
    }
    
}
