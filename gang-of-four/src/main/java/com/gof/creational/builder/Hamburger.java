package com.gof.creational.builder;

public class Hamburger {

    private final Bread bread;
    private final Cheese cheese;
    private final Mayonnaise mayonnaise;
    private final Ketchup ketchup;

    private Hamburger(Bread bread, Cheese cheese, Mayonnaise mayonnaise, Ketchup ketchup) {
        this.bread = bread;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        this.ketchup = ketchup;
    }

    public static HamburgerBuilder aBuilder() {
        return new HamburgerBuilder();
    }

    public Bread getBread() {
        return bread;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public Mayonnaise getMayonnaise() {
        return mayonnaise;
    }

    public Ketchup getKetchup() {
        return ketchup;
    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "bread=" + bread +
                ", cheese=" + cheese +
                ", mayonnaise=" + mayonnaise +
                ", ketchup=" + ketchup +
                '}';
    }

    public static final class HamburgerBuilder {
        private Bread bread;
        private Cheese cheese;
        private Mayonnaise mayonnaise;
        private Ketchup ketchup;

        private HamburgerBuilder() {
        }

        public static HamburgerBuilder aHamburguer() {
            return new HamburgerBuilder();
        }

        public HamburgerBuilder withBread(Bread bread) {
            this.bread = bread;
            return this;
        }

        public HamburgerBuilder withCheese(Cheese cheese) {
            this.cheese = cheese;
            return this;
        }

        public HamburgerBuilder withMayonaisse(Mayonnaise mayonnaise) {
            this.mayonnaise = mayonnaise;
            return this;
        }

        public HamburgerBuilder withKetchup(Ketchup ketchup) {
            this.ketchup = ketchup;
            return this;
        }

        public Hamburger build() {
            return new Hamburger(bread, cheese, mayonnaise, ketchup);
        }
    }
}
