package com.gof.behavioral.chainofresponsibility.handler;

import com.gof.behavioral.chainofresponsibility.request.ShoppingCart;
import org.javamoney.moneta.Money;

import javax.money.MonetaryAmount;

public class FirstPurchase extends Discount {

    public FirstPurchase(Discount successor, ShoppingCart shoppingCart) {
        super(successor, shoppingCart);
    }

    @Override
    public MonetaryAmount handleRequest() {
        // in a real scenario, this condition should be verified.
        // in this example, for each call, we'll aply 10 Euro for the first purchase
        return Money.of(10, CURRENCY_CODE).add(next());
    }
}
