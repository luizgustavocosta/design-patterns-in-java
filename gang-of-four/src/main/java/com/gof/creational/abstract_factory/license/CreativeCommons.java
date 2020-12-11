package com.gof.creational.abstract_factory.license;

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
