package com.gof.creational.builder;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * The type Order service should.
 */
@ExtendWith(MockitoExtension.class)
class OrderServiceShould {

    /**
     * Create an item given a concrete builder.
     *
     * @param happyMeal the happy meal
     */
    @Test
    void createAnItemGivenAConcreteBuilder(@Mock HappyMeal happyMeal) {
        OrderService service = new OrderService();
        final List<Item> items = service.order(Collections.singletonList(happyMeal));

        assertAll(() -> {
            assertNotNull(items);
            int wantedNumberOfInvocations = 1;
            verify(happyMeal, times(wantedNumberOfInvocations)).buildBeverage();
            verify(happyMeal, times(wantedNumberOfInvocations)).buildDessert();
            verify(happyMeal, times(wantedNumberOfInvocations)).buildHamburger();
            int itemsExpected = 1;
            assertThat(items).as("Should have one element").hasSize(itemsExpected);
        });
    }

}