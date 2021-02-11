package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementor.Container;

public class Truck extends Vehicle {

    public Truck(Container container) {
        super(container);
    }

    @Override
    public float getCapacity() {
        return getContainerCapacity() * 2; // // Since the truck is so big
    }
}
