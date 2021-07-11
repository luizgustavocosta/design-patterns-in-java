package com.gof.behavioral.visitor.gof;

import java.time.LocalDateTime;

class ConcreteElementN implements Element {

    private final LocalDateTime expiration;

    ConcreteElementN(LocalDateTime expiration) {
        this.expiration = expiration;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(expiration);
    }
}
