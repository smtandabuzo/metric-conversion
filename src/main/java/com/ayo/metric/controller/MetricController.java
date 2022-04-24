package com.ayo.metric.controller;

import com.ayo.metric.services.MetricConversionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MetricController {

    @Autowired
    MetricConversionService metricConversionService;

    @GetMapping("/convert/{type}/{toUnit}/{value}")
    public ResponseEntity<String> conversion(@PathVariable final String type,@PathVariable final String toUnit,@PathVariable final Double value){
        Double result = Math.round(metricConversionService.getConversion(type,toUnit,value)*100.0)/100.0;
        return new ResponseEntity<>(result.toString(),HttpStatus.OK);
    }
    
}
