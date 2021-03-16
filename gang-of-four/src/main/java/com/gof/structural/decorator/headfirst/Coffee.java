package com.gof.structural.decorator.headfirst;

import java.math.BigDecimal;

/**
 * The type Coffee.
 */
public class Coffee extends Beverage {

    /**
     * Instantiates a new Coffee.
     */
    public Coffee() {
        super("Coffee");
    }

    @Override
    BigDecimal cost() {
        return BigDecimal.ONE;
    }

}
