package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementor.Container;
import com.gof.structural.bridge.implementor.dimension.Dimension;

import java.math.BigDecimal;

public abstract class Vehicle {

    private final Container container;

    protected Vehicle(Container container) {
        this.container = container;
    }

    public BigDecimal cost() {
        return container.getCost();
    }

    public Dimension dimension() {
        return container.getDimension();
    }

    public String description() {
        return container.getCharacteristics();
    }

    public float getContainerMaxLoad() {
        return container.getDimension().getContainerWeight().getNet();
    }

    public float getContainerCapacity() {
        return container.getDimension().getInteriorMeasurement().getCapacity();
    }

    public abstract float getCapacity();
}
