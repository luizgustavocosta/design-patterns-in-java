package com.gof.behavioral.visitor.gof;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Slf4j
class ConcreteVisitor1 implements Visitor {

    @Override
    public void visit(String value) {
        log.info(this.getClass().getSimpleName() + " called as String arg {" + value + "}");
    }

    @Override
    public void visit(Integer value) {
        log.info(this.getClass().getSimpleName() + " called as Integer arg {" + value + "}");
    }

    @Override
    public void visit(LocalDateTime localDateTime) {
        throw new UnsupportedOperationException();
    }
}
