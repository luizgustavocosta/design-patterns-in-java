package com.gof.structural.proxy.gof;

class RealSubject implements Subject {

    @Override
    public void request() {
        throw new UnsupportedOperationException("This isn't a production code");
    }
}
