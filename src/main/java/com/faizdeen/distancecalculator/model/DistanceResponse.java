package com.faizdeen.distancecalculator.model;

public class DistanceResponse {
    private Object result;
    private String unit;

    public DistanceResponse(Object result, String unit) {
        this.result = result;
        this.unit = unit;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
