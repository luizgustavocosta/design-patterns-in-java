package com.gof.behavioral.chainofresponsibility.request;

import javax.money.MonetaryAmount;

public class Voucher {

    private final String name;
    private final MonetaryAmount amount;

    public Voucher(String name, MonetaryAmount amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public MonetaryAmount getAmount() {
        return amount;
    }


    public static final class VoucherBuilder {
        private String name;
        private MonetaryAmount amount;

        private VoucherBuilder() {
        }

        public static VoucherBuilder aVoucher() {
            return new VoucherBuilder();
        }

        public VoucherBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public VoucherBuilder withAmount(MonetaryAmount amount) {
            this.amount = amount;
            return this;
        }

        public Voucher build() {
            return new Voucher(name, amount);
        }
    }
}
