package com.gof.creational.builder;

/**
 * The type Happy meal.
 * The concrete Builder, constructs and assembles parts of the product by implementing the Builder interface.*
 * defines and keeps track of the representation it creates.
 * provides an interface for retrieving the product (e.g., getItem).
 */
public class HappyMeal extends Builder {

    public HappyMeal() {
        super(new Item("Happy meal :) "));
    }

    @Override
    public void buildHamburger() {
        item.setHamburger(HamburgerType.MEAT.name());
    }

    @Override
    public void buildBeverage() {
        item.setBeverage(Beverage.WATER.name());
    }

    @Override
    public void buildDessert() {
        item.setDessert(Dessert.YOGURT.name());
    }

}
