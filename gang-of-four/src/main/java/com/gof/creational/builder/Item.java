package com.gof.creational.builder;

/**
 * The type Item.
 * Represents the complex object under construction.
 * ConcreteBuilder builds the product’s internal representation and defines the process by which it’s assembled.
 * Includes classes that define the constituent parts, including interfaces for assembling the parts into the final result.
 */
public class Item {

    private String name;
    private String hamburger;
    private String beverage;
    private String dessert;

    /**
     * Instantiates a new Item.
     *
     * @param name the name
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * Sets hamburger.
     *
     * @param hamburger the hamburger
     */
    public void setHamburger(String hamburger) {
        this.hamburger = hamburger;
    }

    /**
     * Sets beverage.
     *
     * @param beverage the beverage
     */
    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    /**
     * Sets dessert.
     *
     * @param dessert the dessert
     */
    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets hamburger.
     *
     * @return the hamburger
     */
    public String getHamburger() {
        return hamburger;
    }

    /**
     * Gets beverage.
     *
     * @return the beverage
     */
    public String getBeverage() {
        return beverage;
    }

    /**
     * Gets dessert.
     *
     * @return the dessert
     */
    public String getDessert() {
        return dessert;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", hamburger='" + hamburger + '\'' +
                ", beverage='" + beverage + '\'' +
                ", dessert='" + dessert + '\'' +
                '}';
    }
}
