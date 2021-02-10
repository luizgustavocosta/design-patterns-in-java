package com.headfirst.structural.bridge;

public class AppMain {

    public static void main(String[] args) {
        TV tv = new Sony();

        ConcreteRemote concreteRemote = new ConcreteRemote(tv);
        concreteRemote.on();
        concreteRemote.setChannel(41);
        concreteRemote.setChannel(105);
        concreteRemote.off();

    }
}
