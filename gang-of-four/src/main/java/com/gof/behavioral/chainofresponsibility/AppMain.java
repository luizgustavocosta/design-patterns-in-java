package com.gof.behavioral.chainofresponsibility;

import com.gof.behavioral.chainofresponsibility.handler.BuyThreePayTwo;
import com.gof.behavioral.chainofresponsibility.handler.DiscountByVoucher;
import com.gof.behavioral.chainofresponsibility.handler.FirstPurchase;
import com.gof.behavioral.chainofresponsibility.request.Item;
import com.gof.behavioral.chainofresponsibility.request.ShoppingCart;
import com.gof.behavioral.chainofresponsibility.request.Voucher;
import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.util.Arrays;
import java.util.List;

public class AppMain {

    public static final String DESIGN_PATTERNS_BOOK = "Design Patterns book";

    public static void main(String[] args) {
        List<Item> items = createItems();
        List<Voucher> vouchers = createVouchers();

        ShoppingCart shoppingCart = ShoppingCart.ShoppingCartBuilder.aShoppingCart()
                .withItems(items)
                .withVouchers(vouchers)
                .build();

        FirstPurchase firstPurchase = new FirstPurchase(null, shoppingCart);
        BuyThreePayTwo buyThreePayTwo = new BuyThreePayTwo(firstPurchase, shoppingCart);
        DiscountByVoucher discountByVoucher = new DiscountByVoucher(buyThreePayTwo, shoppingCart);

        final MonetaryAmount monetaryAmount = discountByVoucher.handleRequest();
        System.out.println("Discount for you =) .:"+monetaryAmount);

    }

    private static List<Voucher> createVouchers() {
        return Arrays.asList(
                Voucher.VoucherBuilder.aVoucher().withName("VOUCHER_42").withAmount(Money.of(11.99, "EUR")).build(),
                Voucher.VoucherBuilder.aVoucher().withName("VOUCHER_43").withAmount(Money.of(21.99, "EUR")).build(),
                Voucher.VoucherBuilder.aVoucher().withName("VOUCHER_44").withAmount(Money.of(100.99, "EUR")).build()
        );
    }

    private static List<Item> createItems() {

        CurrencyUnit unitEuro = Monetary.getCurrency("EUR");

        return Arrays.asList(
            Item.ItemBuilder.anItem().withName(DESIGN_PATTERNS_BOOK).withAmount(Money.of(42.05, unitEuro)).build(),
            Item.ItemBuilder.anItem().withName("Sapiens").withAmount(Money.of(42.99, unitEuro)).build(),
            Item.ItemBuilder.anItem().withName(DESIGN_PATTERNS_BOOK).withAmount(Money.of(42.05, unitEuro)).build(),
            Item.ItemBuilder.anItem().withName("How to play soccer").withAmount(Money.of(11.20, unitEuro)).build(),
            Item.ItemBuilder.anItem().withName("How to play football").withAmount(Money.of(11.20, unitEuro)).build(),
            Item.ItemBuilder.anItem().withName(DESIGN_PATTERNS_BOOK).withAmount(Money.of(42.05, unitEuro)).build());
    }
}
