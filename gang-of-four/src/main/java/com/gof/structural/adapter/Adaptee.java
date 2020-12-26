package com.gof.structural.adapter;

/**
 * Defines an existing interface that needs adapting.
 */
public class Adaptee<T> {

    T specificRequest() {
        throw new UnsupportedOperationException();
    }
}
