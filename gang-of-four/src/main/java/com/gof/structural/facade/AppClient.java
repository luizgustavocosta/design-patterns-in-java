package com.gof.structural.facade;

public class AppClient {

    public static void main(String[] args) {
        Facade facade = Facade.INSTANCE;
        facade.doStuff();
    }
}
