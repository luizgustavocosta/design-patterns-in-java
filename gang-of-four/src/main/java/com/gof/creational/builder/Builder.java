package com.gof.creational.builder;


/**
 * The type Builder.
 * Specifies an abstract interface for creating parts of a Product object.
 */
public abstract class Builder {

    /**
     * The Item.
     */
    protected final Item item;

    /**
     * Instantiates a new Builder.
     *
     * @param item the item
     */
    protected Builder(Item item) {
        this.item = item;
    }

    /**
     * Build hamburger.
     */
    abstract void buildHamburger();

    /**
     * Build beverage.
     */
    abstract void buildBeverage();

    /**
     * Build dessert.
     */
    abstract void buildDessert();

    /**
     * Gets item.
     *
     * @return the item
     */
    Item getItem() {
        return this.item;
    }
}
