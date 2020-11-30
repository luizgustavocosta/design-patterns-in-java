package com.gof.creational.factory_method;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

public class PagesDocument extends DocumentAttributes implements Document {

    public PagesDocument() {
        super("untitled.pages",
                ZonedDateTime.now(ZoneId.of("UTC")).toString(),
                1L);
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
