package com.gof.behavioral.command;

/**
 * The type Heading left.
 * The concrete command that defines a binding between a Receiver object and an action.
 * Implements Execute by invoking the corresponding operation(s) on Receiver.
 */
public class HeadingLeft implements Command {

    private final HeadingReceiver receiver;

    /**
     * Instantiates a new Heading left.
     *
     * @param receiver the receiver
     */
    public HeadingLeft(HeadingReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.left();
    }
}
