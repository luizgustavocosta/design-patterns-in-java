package com.gof.creational.builder;

public class Item {

    private String name;
    private String hamburger;
    private String beverage;
    private String dessert;

    public Item(String name) {
        this.name = name;
    }

    public String getHamburger() {
        return hamburger;
    }

    public void setHamburger(String hamburger) {
        this.hamburger = hamburger;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
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
