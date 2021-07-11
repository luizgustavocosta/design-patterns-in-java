package com.gof.behavioral.visitor.gof;

import java.time.LocalDateTime;

interface Visitor {

    void visit(String value);
    void visit(Integer value);
    void visit(LocalDateTime localDateTime);
}
