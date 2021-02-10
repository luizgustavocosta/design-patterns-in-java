package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementation.Cargo;

public class WaterCraft extends Vehicle {

    public WaterCraft(Cargo cargo) {
        super(cargo);
    }
}
