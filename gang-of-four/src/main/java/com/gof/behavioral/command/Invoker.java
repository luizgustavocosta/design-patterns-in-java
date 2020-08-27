package com.gof.behavioral.command;

/**
 * The type Invoker.
 * Asks the command to carry out the request.
 */
public class Invoker {

    private final Command command;

    /**
     * Instantiates a new Invoker.
     *
     * @param command the command
     */
    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * Execute.
     */
    public void execute() {
        command.execute();
    }
}
