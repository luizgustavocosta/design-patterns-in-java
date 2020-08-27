package com.gof.behavioral.chainofresponsibility.handler;

import com.gof.behavioral.chainofresponsibility.request.ShoppingCart;
import com.gof.behavioral.chainofresponsibility.request.Voucher;
import org.assertj.core.api.WithAssertions;
import org.javamoney.moneta.Money;
import org.junit.jupiter.api.Test;

import javax.money.MonetaryAmount;
import java.util.Arrays;
import java.util.List;

public class DiscountByVoucherTest implements WithAssertions {

    @Test
    void handleRequest() {
        List<Voucher> vouchers = Arrays.asList(
                Voucher.VoucherBuilder.aVoucher().withName("VOUCHER_42").withAmount(Money.of(11.99, "EUR")).build(),
                Voucher.VoucherBuilder.aVoucher().withName("VOUCHER_43").withAmount(Money.of(21.99, "EUR")).build(),
                Voucher.VoucherBuilder.aVoucher().withName("VOUCHER_44").withAmount(Money.of(100.99, "EUR")).build()
        );
        DiscountByVoucher discountByVoucher = new DiscountByVoucher(null,
                ShoppingCart.ShoppingCartBuilder.aShoppingCart().withVouchers(vouchers).build());

        final MonetaryAmount monetaryAmount = discountByVoucher.handleRequest();
        Money moneyExpected = Money.of(11.99, "EUR");
        assertThat(moneyExpected.getNumber().doubleValue()).as("Discount expected").isEqualTo(monetaryAmount.getNumber().doubleValue());
    }
}