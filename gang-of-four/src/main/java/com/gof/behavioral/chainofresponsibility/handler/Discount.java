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

/**
 * The type Discount.
 */
abstract class Discount implements ChainDiscount {

    private final ShoppingCart shoppingCart;
    private final Discount successor;
    /**
     * The constant ZERO_EURO.
     */
    protected static final MonetaryAmount ZERO_EURO = Money.of(0, "EUR");
    /**
     * The constant CURRENCY_CODE.
     */
    protected static final String CURRENCY_CODE = "EUR";

    /**
     * Gets grouping items.
     *
     * @return the grouping items
     */
    protected Map<String, List<Item>> getGroupingItems() {
        if (isNull(shoppingCart)) {
            return Collections.emptyMap();
        }
        return shoppingCart.getItems().stream().collect(Collectors.groupingBy(Item::getName));
    }

    /**
     * Instantiates a new Discount.
     *
     * @param successor    the successor
     * @param shoppingCart the shopping cart
     */
    public Discount(Discount successor, ShoppingCart shoppingCart) {
        this.successor = successor;
        this.shoppingCart = shoppingCart;
    }

    /**
     * Next monetary amount.
     *
     * @return the monetary amount
     */
    MonetaryAmount next() {
        if (nonNull(successor)) {
            return successor.handleRequest();
        }
        return ZERO_EURO;
    }

    /**
     * Gets shopping cart.
     *
     * @return the shopping cart
     */
    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}
