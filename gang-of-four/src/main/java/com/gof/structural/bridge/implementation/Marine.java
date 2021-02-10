package com.gof.structural.bridge.implementation;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public class Marine implements Cargo {

    @Override
    public BigDecimal cost() {
        return new BigDecimal(10);
    }

    @Override
    public ZonedDateTime estimateArrivalTime() {
        return ZonedDateTime.now().plusDays(2);
    }

    @Override
    public double maxLoad() {
        return 24_000d;
    }
}
