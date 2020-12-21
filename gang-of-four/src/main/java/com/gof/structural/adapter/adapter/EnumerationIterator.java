package com.gof.structural.adapter.adapter;

public class EnumerationIterator implements Iterator {

    Enumeration enumeration;

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }

    @Override
    public Object remove() {
        throw new UnsupportedOperationException();
    }
}
