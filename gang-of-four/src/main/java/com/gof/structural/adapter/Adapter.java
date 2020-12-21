package com.gof.structural.adapter;

/**
 * Adapts the interface of Adaptee to the Target interface.
 */
public class Adapter implements Target<MyDomainObject> {

    @Override
    public <T> T request() {
        return null;
    }
}
