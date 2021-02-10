package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementation.Cargo;

public class Truck extends Vehicle {

    public Truck(Cargo cargo) {
        super(cargo);
    }
}
