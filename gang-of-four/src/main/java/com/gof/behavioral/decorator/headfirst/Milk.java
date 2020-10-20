package com.gof.behavioral.decorator.headfirst;

import java.math.BigDecimal;

/**
 * The type Milk.
 */
public class Milk extends CondimentDecorator {

    private final Beverage beverage;
    private static final String description = "Milk";

    /**
     * Instantiates a new Milk.
     *
     * @param beverage the beverage
     */
    public Milk(Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

    @Override
    BigDecimal cost() {
        return BigDecimal.ONE.add(beverage.cost());
    }

    @Override
    String getDescription() {
        return String.join("+", beverage.getDescription(), description);
    }
}
