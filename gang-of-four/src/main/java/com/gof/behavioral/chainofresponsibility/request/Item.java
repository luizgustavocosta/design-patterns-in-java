package com.gof.behavioral.chainofresponsibility.request;

import javax.money.MonetaryAmount;

/**
 * The type Item.
 */
public class Item {

    private final String name;
    private final MonetaryAmount amount;

    /**
     * Instantiates a new Item.
     *
     * @param amount the amount
     * @param name   the name
     */
    public Item(MonetaryAmount amount, String name) {
        this.amount = amount;
        this.name = name;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public MonetaryAmount getAmount() {
        return amount;
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
     * The type Item builder.
     */
    public static final class ItemBuilder {
        private MonetaryAmount amount;
        private String name;

        private ItemBuilder() {
        }

        /**
         * An item item builder.
         *
         * @return the item builder
         */
        public static ItemBuilder anItem() {
            return new ItemBuilder();
        }

        /**
         * With amount item builder.
         *
         * @param amount the amount
         * @return the item builder
         */
        public ItemBuilder withAmount(MonetaryAmount amount) {
            this.amount = amount;
            return this;
        }

        /**
         * With name item builder.
         *
         * @param name the name
         * @return the item builder
         */
        public ItemBuilder withName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Build item.
         *
         * @return the item
         */
        public Item build() {
            return new Item(amount, name);
        }
    }
}
