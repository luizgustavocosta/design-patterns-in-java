package com.gof.structural.bridge.implementor;

import com.gof.structural.bridge.implementor.dimension.Dimension;

import java.math.BigDecimal;

public interface Container {

    BigDecimal getCost();
    Dimension getDimension();
    String getCharacteristics();
}
