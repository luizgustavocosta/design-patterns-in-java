package com.gof.creational.builder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The type App main builder.
 * Director constructs an object using the Builder interface.
 */
public class AppMainBuilder {

    public static void main(String[] args) {
        new AppMainBuilder().order();
    }

    /**
     * Order product.
     *
     * @return the product
     */
    List<Item> order() {
        final List<MenuItem> order = Arrays.asList(new HappyMeal(), new RoyalCheese(), new SzechuanSpecial());
        final List<Item> finalOrder = order.stream()
                .map(AppMainBuilder::apply)
                .collect(Collectors.toList());
        System.out.println("finalOrder = " + finalOrder);
        return finalOrder;
    }

    private static Item apply(MenuItem item) {
        final ItemDirector itemDirector = new ItemDirector(item);
        itemDirector.construct();
        return item.getItem();
    }
}
