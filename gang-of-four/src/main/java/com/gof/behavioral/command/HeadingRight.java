package com.gof.behavioral.command;

/**
 * The type Heading right.
 * The concrete command that defines a binding between a Receiver object and an action.
 * Implements Execute by invoking the corresponding operation(s) on Receiver.
 */
public class HeadingRight implements Command {

    private final HeadingReceiver headingReceiver;

    /**
     * Instantiates a new Heading right.
     *
     * @param headingReceiver the heading
     */
    public HeadingRight(HeadingReceiver headingReceiver) {
        this.headingReceiver = headingReceiver;
    }

    @Override
    public void execute() {
        headingReceiver.right();
    }
}
