package com.faizdeen.distancecalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.faizdeen.distancecalculator.model.DistanceRequest;
import com.faizdeen.distancecalculator.model.DistanceResponse;
import com.faizdeen.distancecalculator.service.DistanceCalculatorService;

@RestController
public class DistanceCalculatorController {

    private final DistanceCalculatorService calculatorService;

    @Autowired
    public DistanceCalculatorController(DistanceCalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/calculate-distance")
    public DistanceResponse calculateDistance(@RequestBody DistanceRequest request) {
        return calculatorService.calculateDistance(request);
    }
}
