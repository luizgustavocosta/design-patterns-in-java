package com.gof.creational.abstract_factory.license;

import java.util.Optional;

public class CreativeCommons implements License {

    @Override
    public String name() {
        return "Creative Commons";
    }

    @Override
    public String expiration() {
        return "Never";
    }
}
