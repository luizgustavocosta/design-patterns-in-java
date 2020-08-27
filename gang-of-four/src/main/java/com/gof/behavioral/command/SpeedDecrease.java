package com.gof.behavioral.command;

/**
 * The type Speed decrease.
 * The concrete command that defines a binding between a Receiver object and an action.
 * Implements Execute by invoking the corresponding operation(s) on Receiver.
 */
public class SpeedDecrease implements Command {

    private final SpeedReceiver receiver;

    /**
     * Instantiates a new Speed decrease.
     *
     * @param receiver the engine
     */
    public SpeedDecrease(SpeedReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.decrease();
    }
}
