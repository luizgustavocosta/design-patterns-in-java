package com.gof.creational.builder;

/**
 * The type Royal cheese.
 * The concrete Builder, constructs and assembles parts of the product by implementing the Builder interface.*
 * defines and keeps track of the representation it creates.
 * provides an interface for retrieving the product (e.g., getItem).
 * */
public class RoyalCheese extends Builder {

    /**
     * Instantiates a new Royal cheese.
     */
    public RoyalCheese() {
        super(new Item("Royal from Vincent Vega"));
    }

    @Override
    public void buildHamburger() {
        item.setHamburger(HamburgerType.MEAT.name());
    }

    @Override
    public void buildBeverage() {
        item.setBeverage(Beverage.WINE.name());
    }

    @Override
    public void buildDessert() {
        item.setDessert(Dessert.ICE_CREAM.name());
    }
}
