package com.gof.behavioral.strategy.discount.individual;

import java.math.BigDecimal;

public class Christimas implements Discount {

    @Override
    public BigDecimal apply(BigDecimal price) {
        return price.multiply(new BigDecimal(0.8));
    }
}
