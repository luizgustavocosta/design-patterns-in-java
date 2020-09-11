package com.gof.creational.builder;

/**
 * The type Szechuan special.
 * The concrete Builder, constructs and assembles parts of the product by implementing the Builder interface.*
 * defines and keeps track of the representation it creates.
 * provides an interface for retrieving the product (e.g., getItem).
 */
public class SzechuanSpecial extends Builder {

    /**
     * Instantiates a new Szechuan special.
     */
    public SzechuanSpecial() {
        super(new Item("Special item from Rick's C-137"));
    }

    @Override
    public void buildHamburger() {
        item.setHamburger(HamburgerType.VEGAN.name());
    }

    @Override
    public void buildBeverage() {
        item.setBeverage(Beverage.BEER.name());
    }

    @Override
    public void buildDessert() {
        item.setDessert(Dessert.ICE_CREAM.name());
    }
}
