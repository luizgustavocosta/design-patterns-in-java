package com.gof.behavioral.decorator.headfirst;

import java.math.BigDecimal;

/**
 * The type Ice.
 */
public class Ice extends CondimentDecorator {

    private static final String description = "Ice";
    private final Beverage beverage;

    /**
     * Instantiates a new Ice.
     *
     * @param beverage the beverage
     */
    public Ice(Beverage beverage) {
        super(description);
        this.beverage = beverage;
    }

    @Override
    BigDecimal cost() {
        return BigDecimal.TEN.add(beverage.cost());
    }

    @Override
    String getDescription() {
        return String.join("+", beverage.getDescription(), description);
    }
}
