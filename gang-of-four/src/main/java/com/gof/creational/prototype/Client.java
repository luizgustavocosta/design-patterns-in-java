package com.gof.creational.prototype;

import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Represents the client
 */
public class Client {

    private static final Logger logger = Logger.getLogger(Client.class.getName());

    public static void main(String[] args) {

        Prototype repository = new Repository("Luiz Costa", "Design Patterns", "Design Patterns using Java",
                Visibility.PUBLIC, Collections.emptyList(), Collections.emptyList());

        final Object myClonedRepository = repository.prototype();

        logger.log(Level.INFO, repository::toString);
        logger.log(Level.INFO, myClonedRepository::toString);

        logger.log(Level.INFO, () -> "Are they equals (false) (true) ? " + repository.equals(myClonedRepository));

    }
}
