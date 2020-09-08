package com.gof.behavioral.interpreter;

/**
 * RegularExpression
 * Declares an abstract Interpret operation that is common to all nodes in the abstract syntax tree.
 */
public abstract class AbstractExpression {

    abstract void interpret(Context context);
}
