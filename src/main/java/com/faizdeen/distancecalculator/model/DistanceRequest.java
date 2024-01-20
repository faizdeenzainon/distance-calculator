package com.faizdeen.distancecalculator.model;

public class DistanceRequest {
    private double distance1;
    private String unit1;
    private double distance2;
    private String unit2;
    private String outputUnit;

    public double getDistance1() {
        return distance1;
    }

    public void setDistance1(double distance1) {
        this.distance1 = distance1;
    }

    public String getUnit1() {
        return unit1;
    }

    public void setUnit1(String unit1) {
        this.unit1 = unit1;
    }

    public double getDistance2() {
        return distance2;
    }

    public void setDistance2(double distance2) {
        this.distance2 = distance2;
    }

    public String getUnit2() {
        return unit2;
    }

    public void setUnit2(String unit2) {
        this.unit2 = unit2;
    }

    public String getOutputUnit() {
        return outputUnit;
    }

    public void setOutputUnit(String outputUnit) {
        this.outputUnit = outputUnit;
    }
}
