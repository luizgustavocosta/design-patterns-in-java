package com.gof.structural.decorator.headfirst;

import java.math.BigDecimal;

/**
 * The type Cacao lat.
 */
public class CacaoLat extends Beverage {

    /**
     * Instantiates a new Cacao lat.
     */
    public CacaoLat() {
        super("CacaoLat");
    }

    @Override
    BigDecimal cost() {
        return BigDecimal.TEN;
    }

}
