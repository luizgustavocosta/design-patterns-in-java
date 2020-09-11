package com.gof.creational.builder;

import java.util.Arrays;
import java.util.List;

/**
 * The type App main builder.
 * Director constructs an object using the Builder interface.
 */
public class AppMainBuilder {

    public static void main(String[] args) {
        final OrderService service = new OrderService();
        final List<Item> itemList = service.order(Arrays.asList(new HappyMeal(), new RoyalCheese(), new SzechuanSpecial()));
        System.out.println("itemList = " + itemList);
    }
}
