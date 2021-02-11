package com.gof.structural.bridge.implementor.dimension;

public class ContainerWeight {

    private final float gross;
    private final float tare;
    private final float net;

    public ContainerWeight(float gross, float tare, float net) {
        this.gross = gross;
        this.tare = tare;
        this.net = net;
    }

    public float getGross() {
        return gross;
    }

    public float getTare() {
        return tare;
    }

    public float getNet() {
        return net;
    }

    @Override
    public String toString() {
        return "ContainerWeight{" +
                "gross=" + gross +
                ", tare=" + tare +
                ", net=" + net +
                '}';
    }
}
