package com.gof.creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    MyService myService;

    EnumSingleton() {
        myService = new MyService();
    }
}