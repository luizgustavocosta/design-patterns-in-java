package com.gof.structural.bridge.implementation;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class Road implements Cargo {

    @Override
    public BigDecimal cost() {
        return new BigDecimal(5);
    }

    @Override
    public ZonedDateTime estimateArrivalTime() {
        return ZonedDateTime.now().plusMinutes(30);
    }

    @Override
    public double maxLoad() {
        return 100d;
    }
}
