package com.gof.structural.adapter.by_object;

public class Adapter {

    Adaptee adaptee;

    public void request() {
        adaptee.specificRequest();
    }
}
