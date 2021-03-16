package com.gof.structural.decorator.headfirst;

import java.math.BigDecimal;

/**
 * The type Beverage.
 */
public abstract class Beverage {

    private final String description;

    /**
     * Instantiates a new Beverage.
     *
     * @param description the description
     */
    public Beverage(String description) {
        this.description = description;
    }

    /**
     * Cost big decimal.
     *
     * @return the big decimal
     */
    abstract BigDecimal cost();

    String getDescription() {
        return description;
    }
}
