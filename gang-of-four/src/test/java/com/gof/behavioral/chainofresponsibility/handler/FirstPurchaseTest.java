package com.gof.behavioral.chainofresponsibility.handler;

import com.gof.behavioral.chainofresponsibility.request.ShoppingCart;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.Test;

import javax.money.MonetaryAmount;

public class FirstPurchaseTest implements WithAssertions {

    @Test
    void handleRequest() {
        FirstPurchase firstPurchase = new FirstPurchase(null, ShoppingCart.ShoppingCartBuilder.aShoppingCart().build());
        final MonetaryAmount monetaryAmount = firstPurchase.handleRequest();
        assertThat(10d).isEqualTo(monetaryAmount.getNumber().doubleValue());

    }
}