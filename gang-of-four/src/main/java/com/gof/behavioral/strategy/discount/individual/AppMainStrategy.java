package com.gof.behavioral.strategy.discount.individual;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class AppMainStrategy {

    private static Logger logger = Logger.getLogger(AppMainStrategy.class.getName());

    public static void main(String[] args) {
        List<Discount> discounts = Arrays.asList(
                Discount.christmas(),
                Discount.easter(),
                Discount.newYear(),
                new Carnival(),
                new Christimas());

        final BigDecimal valueWithReduce = discounts.stream()
                .reduce(productValue -> productValue, Discount::combine)
                .apply(BigDecimal.valueOf(100.00));

        logger.info(() ->
                new DecimalFormat("The value is")
                .format(valueWithReduce));

    }
}
