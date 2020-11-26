package com.gof.creational.singleton;

import java.util.Collections;
import java.util.List;

import static java.util.Objects.isNull;

public final class MyServiceSingleton {

    private static MyServiceSingleton instance;

    private MyServiceSingleton() {}

    static {
        // Instantiate here if you want a Eager loading
    }

    public static synchronized MyServiceSingleton getInstance() {
        if (isNull(instance)) {
            instance = new MyServiceSingleton();
        }
        return instance;
    }

    public int countTasks() {
        return 1;
    }
}
