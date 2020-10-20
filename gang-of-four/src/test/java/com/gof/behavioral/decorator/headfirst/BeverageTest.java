package com.gof.behavioral.decorator.headfirst;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * The type Beverage test.
 */
class BeverageTest {

    /**
     * Calculate cost.
     */
    @Test void calculateCost() {
        Beverage coffee = new Coffee();
        coffee = new Milk(coffee);
        coffee = new Ice(coffee);
        assertThat(coffee.cost()).as("The price should be twelve").isEqualTo(BigDecimal.valueOf(12));
    }

}