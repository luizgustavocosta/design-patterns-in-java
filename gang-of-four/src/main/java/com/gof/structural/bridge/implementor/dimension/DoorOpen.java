package com.gof.structural.bridge.implementor.dimension;

public class DoorOpen {

    private final float width;
    private final float height;

    public DoorOpen(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "DoorOpen{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
