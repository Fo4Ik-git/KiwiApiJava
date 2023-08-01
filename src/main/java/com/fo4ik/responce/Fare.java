package com.fo4ik.responce;

public class Fare {

    private double adults;
    private double children;
    private double infants;

    public double getAdults() {
        return adults;
    }

    public void setAdults(double adults) {
        this.adults = adults;
    }

    public double getChildren() {
        return children;
    }

    public void setChildren(double children) {
        this.children = children;
    }

    public double getInfants() {
        return infants;
    }

    public void setInfants(double infants) {
        this.infants = infants;
    }

    @Override
    public String toString() {
        return "Fare{" +
                "adults=" + adults +
                ", children=" + children +
                ", infants=" + infants +
                '}';
    }
}
