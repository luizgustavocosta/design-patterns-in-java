package com.gof.behavioral.decorator.headfirst;

/**
 * The type Condiment decorator.
 */
public abstract class CondimentDecorator extends Beverage {

    /**
     * Instantiates a new Condiment decorator.
     *
     * @param description the description
     */
    public CondimentDecorator(String description) {
        super(description);
    }
}
