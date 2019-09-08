package com.gof.behavioral.chainofresponsibility.handler;

import com.gof.behavioral.chainofresponsibility.request.Item;
import com.gof.behavioral.chainofresponsibility.request.ShoppingCart;
import org.javamoney.moneta.Money;

import javax.money.MonetaryAmount;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

abstract class Discount implements ChainDiscount {

    private final ShoppingCart shoppingCart;
    private final Discount successor;
    protected static final MonetaryAmount ZERO_EURO = Money.of(0, "EUR");
    protected static final String CURRENCY_CODE = "EUR";

    protected Map<String, List<Item>> getGroupingItems() {
        if (isNull(shoppingCart)) {
            return Collections.emptyMap();
        }
        return shoppingCart.getItems().stream().collect(Collectors.groupingBy(Item::getName));
    }

    public Discount(Discount successor, ShoppingCart shoppingCart) {
        this.successor = successor;
        this.shoppingCart = shoppingCart;
    }

    MonetaryAmount next() {
        if (nonNull(successor)) {
            return successor.handleRequest();
        }
        return ZERO_EURO;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
