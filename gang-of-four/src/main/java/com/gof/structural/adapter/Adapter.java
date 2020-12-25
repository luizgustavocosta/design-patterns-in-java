package com.gof.structural.adapter;

/**
 * Adapts the interface of Adaptee to the Target interface.
 */
public class Adapter implements Target<Output, Input> {

    private Input input;

    @Override
    public <T> T request(Input input) {
        return (T) new USBC();
    }
}
