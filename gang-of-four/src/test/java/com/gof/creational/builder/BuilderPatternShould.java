package com.gof.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuilderPatternShould {

    @Test
    void buildAMenuWithoutDessert() {
        final Menu menu = Menu.aBuilder()
                .withHamburger(Hamburger.aBuilder()
                        .withBread(Bread.CIABATTA)
                        .withCheese(Cheese.BRIE)
                        .withMayonaisse(Mayonnaise.HOMEMADE)
                        .build())
                .build();
        assertNull(menu.getDessert());
    }

}