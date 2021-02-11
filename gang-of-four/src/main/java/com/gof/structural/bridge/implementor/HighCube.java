package com.gof.structural.bridge.implementor;

import com.gof.structural.bridge.implementor.dimension.Dimension;
import com.gof.structural.bridge.implementor.dimension.TypeDimension;

import java.math.BigDecimal;

public class HighCube implements Container {

    @Override
    public BigDecimal getCost() {
        // Fake cost
        return BigDecimal.TEN.multiply(BigDecimal.TEN);
    }

    @Override
    public Dimension getDimension() {
        return TypeDimension.HIGH.getDimension();
    }

    @Override
    public String getCharacteristics() {
        return TypeDimension.HIGH.getCharacteristics();
    }
}
