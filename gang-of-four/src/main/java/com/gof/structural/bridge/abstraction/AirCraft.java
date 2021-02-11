package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementor.Container;

public class AirCraft extends Vehicle {

    public AirCraft(Container container) {
        super(container);
    }

    @Override
    public float getCapacity() {
        return 1_300f; //Based on Antonov An-225 Mriya
    }

}
