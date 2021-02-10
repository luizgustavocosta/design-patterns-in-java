package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementation.Cargo;

import java.math.BigDecimal;

public class Motorcycle extends Vehicle {

    public Motorcycle(Cargo cargo) {
        super(cargo);
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.ZERO; // this month an awesome promotion :)
    }
}
