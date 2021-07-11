package com.gof.behavioral.visitor;

@FunctionalInterface
public interface NodeMatch {

    void accept(VisitorRefereeTasks visitor);
}
