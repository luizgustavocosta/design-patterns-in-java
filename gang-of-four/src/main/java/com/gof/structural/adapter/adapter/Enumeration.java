package com.gof.structural.adapter.adapter;

public enum Enumeration {

    hasMoreElements(),
    nextElements();

    public boolean hasMoreElements() {
        return false;
    }

    public Object nextElement() {
        return null;
    }
}
