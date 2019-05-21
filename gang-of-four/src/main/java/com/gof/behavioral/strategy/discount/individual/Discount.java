package com.gof.behavioral.strategy.discount.individual;

import java.math.BigDecimal;
import java.util.function.UnaryOperator;

/**
 * Example from https://www.baeldung.com/java-strategy-pattern
 * This interface works for individual discount.
 */
public interface Discount extends UnaryOperator<BigDecimal> {

    /**
     * Useful for concrete class
     * @param after
     * @return
     */
    default Discount combine(Discount after) {
        return value -> after.apply(this.apply(value));
    }

    static Discount christmas() {
        return (amount) -> amount.multiply(BigDecimal.valueOf(0.9));
    }

    static Discount newYear() {
        return (amount) -> amount.multiply(BigDecimal.valueOf(0.8));
    }

    static Discount easter() {
        return (amount) -> amount.multiply(BigDecimal.valueOf(0.5));
    }

}
