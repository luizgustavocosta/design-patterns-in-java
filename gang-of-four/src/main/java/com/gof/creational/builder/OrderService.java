package com.gof.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Order service.
 */
public class OrderService {

    /**
     * Order list.
     *
     * @param builderList the builder list
     * @return the list
     */
    List<Item> order(List<Builder> builderList) {
        final List<Item> items = new ArrayList<>();
        builderList
                .forEach(menuItem -> {
                    final ItemDirector itemDirector = new ItemDirector(menuItem);
                    itemDirector.construct();
                    items.add(menuItem.getItem());
                });
        return items;
    }
}
