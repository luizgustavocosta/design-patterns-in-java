package com.gof.structural.bridge.abstraction;

import com.gof.structural.bridge.implementation.Cargo;

import java.time.ZonedDateTime;

public class WaterCraft extends Vehicle {

    public WaterCraft(Cargo cargo) {
        super(cargo);
    }

    @Override
    public ZonedDateTime estimateArrivalTime() {
        return super.estimateArrivalTime().minusDays(2); // Will be delivered soon \o/
    }
}
