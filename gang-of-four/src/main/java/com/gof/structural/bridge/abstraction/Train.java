package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementor.Container;

public class Train extends Vehicle {

    public Train(Container container) {
        super(container);
    }

    @Override
    public float getCapacity() {
        return getContainerCapacity() * 42; // Is too big
    }
}
