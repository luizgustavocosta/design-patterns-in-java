package com.gof.structural.bridge.implementation;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

public interface Cargo {

    BigDecimal cost();
    ZonedDateTime estimateArrivalTime();
    double maxLoad();
}
