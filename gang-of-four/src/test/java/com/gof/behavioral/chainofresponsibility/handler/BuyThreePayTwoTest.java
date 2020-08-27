package com.gof.behavioral.chainofresponsibility.handler;

import com.gof.behavioral.chainofresponsibility.request.Item;
import com.gof.behavioral.chainofresponsibility.request.ShoppingCart;
import org.assertj.core.api.WithAssertions;
import org.javamoney.moneta.Money;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.util.Arrays;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BuyThreePayTwoTest implements WithAssertions {

    private List<Item> items;

    @BeforeAll
    void setUp() {
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
    void handleRequest() {
        BuyThreePayTwo buyThreePayTwo = new BuyThreePayTwo(null, ShoppingCart.ShoppingCartBuilder.aShoppingCart().withItems(items).build());
        final MonetaryAmount monetaryAmount = buyThreePayTwo.handleRequest();
        final Item item = items.stream().findFirst().orElseThrow();
        assertThat(item.getAmount().getNumber().doubleValue()).isEqualTo(monetaryAmount.getNumber().doubleValue());
    }
}