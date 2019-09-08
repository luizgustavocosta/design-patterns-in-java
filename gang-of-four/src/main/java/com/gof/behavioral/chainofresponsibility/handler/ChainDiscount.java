package com.gof.behavioral.chainofresponsibility.handler;

import javax.money.MonetaryAmount;

/**
 * The interface Chain discount.
 */
@FunctionalInterface
public interface ChainDiscount {

    /**
     * Handle request monetary amount.
     *
     * @return the monetary amount
     */
    MonetaryAmount handleRequest();
}
