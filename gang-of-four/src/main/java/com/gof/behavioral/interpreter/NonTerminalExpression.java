package com.gof.behavioral.interpreter;

/**
 * The type for AlternationExpression, RepetitionExpression, SequenceExpressions
 * One such class is required for every rule R ::= R1R2...Rn in the grammar.
 * Maintains instance variables of type AbstractExpression for each of the symbols R1 through Rn.
 * Implements an Interpret operation for non-terminal symbols in the grammar.
 * Interpret typically calls itself recursively on the variables representing R1 through Rn.
 *
 */
public class NonTerminalExpression {
}
