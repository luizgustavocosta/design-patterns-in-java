package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementation.Cargo;

public class Motorcycle extends Vehicle {

    public Motorcycle(Cargo cargo) {
        super(cargo);
    }
}
