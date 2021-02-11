package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementor.Container;

public class WaterCraft extends Vehicle {

    public WaterCraft(Container container) {
        super(container);
    }

    @Override
    public float getCapacity() {
        return 266_000f;
    }

}
