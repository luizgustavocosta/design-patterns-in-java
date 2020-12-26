package com.gof.structural.adapter;

/**
 * Adapts the interface of Adaptee to the Target interface.
 */
public class Adapter implements Target<Connector> {

    private Adaptee adaptee;

    private Connector connector;

    @Override
    public <T> T request(Connector connector) {
        return (T) adaptee.specificRequest();
    }
}
