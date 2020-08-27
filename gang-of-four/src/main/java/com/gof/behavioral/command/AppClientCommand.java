package com.gof.behavioral.command;

import java.util.Arrays;
import java.util.List;

/**
 * The type App client command.
 * Creates a ConcreteCommand object and sets its receiver
 */
public class AppClientCommand {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpeedReceiver speedReceiver = new SpeedReceiver();
        HeadingReceiver headingReceiver = new HeadingReceiver();

        final List<Command> commands = Arrays.asList(
                new HeadingRight(headingReceiver),
                new SpeedDecrease(speedReceiver),
                new HeadingLeft(headingReceiver),
                new SpeedIncrease(speedReceiver));

        commands.stream().map(Invoker::new).forEach(Invoker::execute);

    }
}
