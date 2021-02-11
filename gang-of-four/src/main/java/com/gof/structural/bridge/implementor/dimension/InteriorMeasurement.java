package com.gof.structural.bridge.implementor.dimension;

public class InteriorMeasurement {

    private final float length;
    private final float width;
    private final float height;
    private final float capacity;

    public InteriorMeasurement(float length, float width, float height, float capacity) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.capacity = capacity;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getCapacity() {
        return capacity;
    }
}
