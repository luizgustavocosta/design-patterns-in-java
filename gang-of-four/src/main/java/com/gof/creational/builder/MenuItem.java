package com.gof.creational.builder;


public abstract class MenuItem {

    public MenuItem(Item item) {
        this.item = item;
    }

    protected Item item;

    public abstract void buildHamburger();

    public abstract void buildBeverage();

    public abstract void buildDessert();

    public Item getItem() {
        return item;
    }
}
