package com.gof.creational.builder;

public class HappyMeal extends MenuItem {

    public HappyMeal() {
        super(new Item("Happy meal :) "));
    }

    @Override
    public void buildHamburger() {
        item.setHamburger(HambugerType.MEAT.name());
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
