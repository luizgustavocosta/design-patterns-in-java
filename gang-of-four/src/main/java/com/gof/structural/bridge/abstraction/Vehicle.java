package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementor.Container;

import java.math.BigDecimal;
import java.util.Objects;

public abstract class Vehicle {

    private final Container container;

    protected Vehicle(Container container) {
        Objects.requireNonNull(container, "The vehicle should have a container");
        this.container = container;
    }

    public BigDecimal cost() {
        return container.getCost();
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
