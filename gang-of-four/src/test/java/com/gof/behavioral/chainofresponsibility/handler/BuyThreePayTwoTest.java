package com.gof.behavioral.chainofresponsibility.handler;

import com.gof.behavioral.chainofresponsibility.handler.BuyThreePayTwo;
import com.gof.behavioral.chainofresponsibility.request.Item;
import com.gof.behavioral.chainofresponsibility.request.ShoppingCart;
import org.assertj.core.api.WithAssertions;
import org.javamoney.moneta.Money;
import org.junit.Before;
import org.junit.Test;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.util.Arrays;
import java.util.List;

public class BuyThreePayTwoTest implements WithAssertions {

    private List<Item> items;

    @Before
    public void setUp() {
        CurrencyUnit unitEuro = Monetary.getCurrency("EUR");

        items = Arrays.asList(
                Item.ItemBuilder.anItem().withName("Design Patterns book").withAmount(Money.of(42.05, unitEuro)).build(),
                Item.ItemBuilder.anItem().withName("Design Patterns book").withAmount(Money.of(42.05, unitEuro)).build(),
                Item.ItemBuilder.anItem().withName("Sapiens").withAmount(Money.of(42.99, unitEuro)).build(),
                Item.ItemBuilder.anItem().withName("Design Patterns book").withAmount(Money.of(42.05, unitEuro)).build(),
                Item.ItemBuilder.anItem().withName("How to play soccer").withAmount(Money.of(11.20, unitEuro)).build(),
                Item.ItemBuilder.anItem().withName("How to play football").withAmount(Money.of(11.20, unitEuro)).build());
    }

    @Test
    public void handleRequest() {
        BuyThreePayTwo buyThreePayTwo = new BuyThreePayTwo(null, ShoppingCart.ShoppingCartBuilder.aShoppingCart().withItems(items).build());
        final MonetaryAmount monetaryAmount = buyThreePayTwo.handleRequest();
        final Item item = items.stream().findFirst().orElseThrow();
        assertThat(item.getAmount().getNumber().doubleValue()).isEqualTo(monetaryAmount.getNumber().doubleValue());
    }
}