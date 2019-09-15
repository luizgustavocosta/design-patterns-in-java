package com.gof.behavioral.visitor;

/**
 * The interface Node match.
 */
@FunctionalInterface
public interface NodeMatch {

    /**
     * Accept.
     *
     * @param visitor the visitor referee tasks
     */
    void accept(VisitorRefereeTasks visitor);
}
