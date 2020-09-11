package com.gof.creational.builder;

public class SzechuanSpecial extends MenuItem {

    public SzechuanSpecial() {
        super(new Item("Rick's order"));
    }

    @Override
    public void buildHamburger() {
        item.setHamburger(HambugerType.VEGAN.name());
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
