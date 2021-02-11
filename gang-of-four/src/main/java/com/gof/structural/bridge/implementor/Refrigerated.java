package com.gof.structural.bridge.implementor;

import com.gof.structural.bridge.implementor.dimension.Dimension;
import com.gof.structural.bridge.implementor.dimension.TypeDimension;

import java.math.BigDecimal;

public class Refrigerated implements Container {

    @Override
    public BigDecimal getCost() {
        //Fake cost
        return BigDecimal.ONE.add(BigDecimal.ONE).multiply(BigDecimal.TEN);
    }

    @Override
    public Dimension getDimension() {
        return TypeDimension.REFRIGERATED.getDimension();
    }

    @Override
    public String getCharacteristics() {
        return TypeDimension.REFRIGERATED.getCharacteristics();
    }
}
