package com.gof.creational.builder;

public class RoyalCheese extends MenuItem {

    public RoyalCheese() {
        super(new Item("Royal from Vicent"));
    }

    @Override
    public void buildHamburger() {
        item.setHamburger(HambugerType.MEAT.name());
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
