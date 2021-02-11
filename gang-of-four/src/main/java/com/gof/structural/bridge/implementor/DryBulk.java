package com.gof.structural.bridge.implementor;

import com.gof.structural.bridge.implementor.dimension.Dimension;
import com.gof.structural.bridge.implementor.dimension.TypeDimension;

import java.math.BigDecimal;

public class DryBulk implements Container {

    @Override
    public BigDecimal getCost() {
        // Fake cost
        return BigDecimal.TEN;
    }

    @Override
    public Dimension getDimension() {
        return TypeDimension.DRY.getDimension();
    }

    @Override
    public String getCharacteristics() {
        return TypeDimension.REFRIGERATED.getCharacteristics();
    }
}
