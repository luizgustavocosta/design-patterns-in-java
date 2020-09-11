package com.gof.creational.builder;

public class ItemDirector {

    private final MenuItem menuItem;

    public ItemDirector(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

    public void construct() {
        menuItem.buildHamburger();
        menuItem.buildBeverage();
        menuItem.buildDessert();
    }
}
