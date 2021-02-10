package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementation.Cargo;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public abstract class Vehicle {

    private final Cargo cargo;

    protected Vehicle(Cargo cargo) {
        this.cargo = cargo;
    }

    public BigDecimal cost() {
        return cargo.cost();
    }

    public ZonedDateTime estimateArrivalTime() {
        return cargo.estimateArrivalTime();
    }

    public double maxLoad() {
        return cargo.maxLoad();
    }

}
