package com.gof.behavioral.strategy.discount.individual;

import java.math.BigDecimal;

public class Product {

    private String id;
    private BigDecimal value;
    private Category category;


    public static final class ProductBuilder {
        private String id;
        private BigDecimal value;
        private Category category;

        private ProductBuilder() {
        }

        public static ProductBuilder aProduct() {
            return new ProductBuilder();
        }

        public ProductBuilder withId(String id) {
            this.id = id;
            return this;
        }

        public ProductBuilder withValue(BigDecimal value) {
            this.value = value;
            return this;
        }

        public ProductBuilder withCategory(Category category) {
            this.category = category;
            return this;
        }

        public Product newProduct() {
            Product product = new Product();
            product.value = this.value;
            product.category = this.category;
            product.id = this.id;
            return product;
        }
    }
}
