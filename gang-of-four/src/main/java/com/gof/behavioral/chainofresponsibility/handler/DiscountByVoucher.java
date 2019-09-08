package com.gof.behavioral.chainofresponsibility.handler;

import com.gof.behavioral.chainofresponsibility.request.ShoppingCart;
import org.javamoney.moneta.Money;

import javax.money.MonetaryAmount;

/**
 * The type Discount by voucher.
 */
public class DiscountByVoucher extends Discount {


    /**
     * Instantiates a new Discount by voucher.
     *
     * @param successor    the successor
     * @param shoppingCart the shopping cart
     */
    public DiscountByVoucher(Discount successor, ShoppingCart shoppingCart) {
        super(successor, shoppingCart);
    }

    @Override
    public MonetaryAmount handleRequest() {

        final double sumVoucher = getShoppingCart().getVouchers().stream()
                .filter(voucher -> voucher.getName().equals("VOUCHER_42"))
                .mapToDouble(value -> value.getAmount().getNumber().doubleValue()).sum();
        return Money.of(sumVoucher, CURRENCY_CODE).add(next());
    }
}
