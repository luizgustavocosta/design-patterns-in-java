package com.gof.behavioral.chainofresponsibility.request;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import static java.util.Objects.isNull;

/**
 * The type Shopping cart.
 */
public class ShoppingCart {

    private final String id;
    private final List<Item> items;
    private final List<Voucher> vouchers;

    /**
     * Instantiates a new Shopping cart.
     *
     * @param id       the id
     * @param items    the items
     * @param vouchers the vouchers
     */
    private ShoppingCart(String id, List<Item> items, List<Voucher> vouchers) {
        this.id = id;
        this.items = items;
        this.vouchers = vouchers;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Gets items.
     *
     * @return the items
     */
    public List<Item> getItems() {
        return items;
    }

    /**
     * Gets vouchers.
     *
     * @return the vouchers
     */
    public List<Voucher> getVouchers() {
        return vouchers;
    }


    /**
     * The type Shopping cart builder.
     */
    public static final class ShoppingCartBuilder {
        private String id;
        private List<Item> items;
        private List<Voucher> vouchers;

        private ShoppingCartBuilder() {
        }

        /**
         * A shopping cart shopping cart builder.
         *
         * @return the shopping cart builder
         */
        public static ShoppingCartBuilder aShoppingCart() {
            return new ShoppingCartBuilder();
        }

        /**
         * With id shopping cart builder.
         *
         * @param id the id
         * @return the shopping cart builder
         */
        public ShoppingCartBuilder withId(String id) {
            this.id = id;
            return this;
        }

        /**
         * With items shopping cart builder.
         *
         * @param items the items
         * @return the shopping cart builder
         */
        public ShoppingCartBuilder withItems(List<Item> items) {
            this.items = items;
            return this;
        }

        /**
         * With vouchers shopping cart builder.
         *
         * @param vouchers the vouchers
         * @return the shopping cart builder
         */
        public ShoppingCartBuilder withVouchers(List<Voucher> vouchers) {
            this.vouchers = vouchers;
            return this;
        }

        /**
         * Build shopping cart.
         *
         * @return the shopping cart
         */
        public ShoppingCart build() {
            return new ShoppingCart(UUID.randomUUID().toString(), items, vouchers);
        }
    }
}
