package com.gof.creational.factory_method;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * The type My document aka ConcreteProduct
 * ConcreteProduct implements the Product interface.
 */
public class GoogleDoc extends DocumentAttributes implements Document {

    public GoogleDoc() {
        super("Untitled document",
                ZonedDateTime.now(ZoneId.of("UTC")).toString(),
                0L);
    }

    @Override
    public void rename(String newName) {
    }

    @Override
    public void delete() {
    }

    @Override
    public void share(List<String> users) {
    }
}
