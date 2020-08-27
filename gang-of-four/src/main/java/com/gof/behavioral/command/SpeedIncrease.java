package com.gof.behavioral.command;

/**
 * The type Speed increase.
 * The concrete command that defines a binding between a Receiver object and an action.
 * Implements Execute by invoking the corresponding operation(s) on Receiver.
 */
public class SpeedIncrease implements Command {

    private final SpeedReceiver receiver;

    /**
     * Instantiates a new Speed increase.
     *
     * @param receiver the engine
     */
    public SpeedIncrease(SpeedReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.increase();
    }
}
