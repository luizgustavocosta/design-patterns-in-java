package com.gof.creational.abstract_factory.license;

public class Freeware implements License {

    @Override
    public String name() {
        return "Freeware";
    }

    @Override
    public String expiration() {
        return "Never";
    }
}
