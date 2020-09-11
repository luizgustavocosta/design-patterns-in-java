package com.gof.creational.builder;


/**
 * The type Item director.
 * Director constructs an object using the Builder interface.
 */
public class ItemDirector {

    private final Builder builder;

    /**
     * Instantiates a new Item director.
     *
     * @param builder the menu item
     */
    public ItemDirector(Builder builder) {
        this.builder = builder;
    }

    /**
     * Construct.
     */
    public void construct() {
        builder.buildHamburger();
        builder.buildBeverage();
        builder.buildDessert();
    }
}
