package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementor.Container;

import java.math.BigDecimal;

public class Truck extends Vehicle {

    public Truck(Container container) {
        super(container);
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.ONE.add(BigDecimal.ONE); // Special offer
    }

    @Override
    public float getCapacity() {
        return getContainerCapacity() * 2; // // Since the truck is so big
    }
}
