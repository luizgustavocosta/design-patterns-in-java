package com.gof.structural.proxy.gof;

class Proxy implements Subject {

    private final RealSubject realSubject;

    Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        realSubject.request();
    }
}
