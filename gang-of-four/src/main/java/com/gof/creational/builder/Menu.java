package com.gof.creational.builder;

public class Menu {

    private Hamburger hamburger;
    private Beverage beverage;
    private Dessert dessert;

    private Menu(Hamburger hamburger, Beverage beverage, Dessert dessert) {
        this.hamburger = hamburger;
        this.beverage = beverage;
        this.dessert = dessert;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public static MenuBuilder aBuilder() {
        return new MenuBuilder();
    }

    public static final class MenuBuilder {
        private Hamburger hamburger;
        private Beverage beverage;
        private Dessert dessert;

        private MenuBuilder() {
        }

        public static MenuBuilder aMenu() {
            return new MenuBuilder();
        }

        public MenuBuilder withHamburger(Hamburger hamburger) {
            this.hamburger = hamburger;
            return this;
        }

        public MenuBuilder withBeverage(Beverage beverage) {
            this.beverage = beverage;
            return this;
        }

        public MenuBuilder withDessert(Dessert dessert) {
            this.dessert = dessert;
            return this;
        }

        public Menu build() {
            return new Menu(hamburger, beverage, dessert);
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "hamburger=" + hamburger +
                ", beverage=" + beverage +
                ", dessert=" + dessert +
                '}';
    }
}
