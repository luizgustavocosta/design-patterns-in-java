package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementation.Cargo;

public class Truck extends Vehicle {

    public Truck(Cargo cargo) {
        super(cargo);
    }

    @Override
    public double maxLoad() {
        return super.maxLoad() * 2; // Since the truck is so big
    }
}
