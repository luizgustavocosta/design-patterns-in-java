package com.gof.creational.singleton;

import static java.util.Objects.isNull;

public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton uniqueInstance() {
        if (isNull(instance)) {
            instance = new Singleton();
        }
        return instance;
    }
}
