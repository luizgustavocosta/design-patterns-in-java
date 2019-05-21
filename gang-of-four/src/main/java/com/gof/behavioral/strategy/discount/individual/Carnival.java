package com.gof.behavioral.strategy.discount.individual;

import java.math.BigDecimal;

/**
 * Discount for Carnival
 */
public class Carnival implements Discount {

    @Override
    public BigDecimal apply(BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(-0.9));
    }
}
