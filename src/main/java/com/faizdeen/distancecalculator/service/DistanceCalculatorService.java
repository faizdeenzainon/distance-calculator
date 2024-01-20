package com.faizdeen.distancecalculator.service;

import org.springframework.stereotype.Service;

import com.faizdeen.distancecalculator.model.DistanceRequest;
import com.faizdeen.distancecalculator.model.DistanceResponse;

@Service
public class DistanceCalculatorService {

    public DistanceResponse calculateDistance(DistanceRequest request) {
        try {
            double distance1InMeters = convertToMeters(request.getDistance1(), request.getUnit1());
            double distance2InMeters = convertToMeters(request.getDistance2(), request.getUnit2());
            double totalDistanceInMeters = distance1InMeters + distance2InMeters;

            double result = convertFromMeters(totalDistanceInMeters, request.getOutputUnit());

            return new DistanceResponse(result, request.getOutputUnit());
        } catch (Exception e) {
            return new DistanceResponse("Error: " + e.getMessage(), null);
        }
    }

    private double convertToMeters(double distance, String unit) {
        if ("yards".equalsIgnoreCase(unit)) {
            return distance * 0.9144;
        } else if ("meters".equalsIgnoreCase(unit)) {
            return distance;
        }
        return distance;
    }

    private double convertFromMeters(double distance, String outputUnit) {
        if ("yards".equalsIgnoreCase(outputUnit)) {
            return distance / 0.9144;
        } else if ("meters".equalsIgnoreCase(outputUnit)) {
            return distance;
        }
        return distance;
    }
}
