package com.gof.behavioral.chainofresponsibility.handler;

import com.gof.behavioral.chainofresponsibility.request.Item;
import com.gof.behavioral.chainofresponsibility.request.ShoppingCart;

import javax.money.MonetaryAmount;

/**
 * The type Buy three pay two.
 */
public class BuyThreePayTwo extends Discount {

    private final int amountToDiscount = 3;

    /**
     * Instantiates a new Buy three pay two.
     *
     * @param successor    the successor
     * @param shoppingCart the shopping cart
     */
    public BuyThreePayTwo(Discount successor, ShoppingCart shoppingCart) {
        super(successor, shoppingCart);
    }

    @Override
    public MonetaryAmount handleRequest() {
        final MonetaryAmount monetaryAmount = getGroupingItems().entrySet().stream()
                .filter(entryItems -> entryItems.getValue().size() >= 3)
                .map(entryItems -> {
                    Item item = entryItems.getValue().stream().findFirst().orElse(null);
                    return item.getAmount().multiply(entryItems.getValue().size() / amountToDiscount);
                })
                .findFirst().orElse(ZERO_EURO);
        return monetaryAmount.add(next());
    }
}
