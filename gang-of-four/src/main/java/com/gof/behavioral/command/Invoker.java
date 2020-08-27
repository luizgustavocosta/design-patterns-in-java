package com.gof.behavioral.command;

/**
 * The type Invoker.
 * Asks the command to carry out the request.
 */
public class Invoker {

    /**
     * Execute.
     *
     * @param command the command
     */
    public static void execute(Command command) {
        command.execute();
    }
}
