package com.gof.structural.adapter;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Collaborates with objects conforming to the Target interface
 */
public class Client {

    private static final Logger logger = Logger.getLogger(Client.class.getName());

    public static void main(String[] args) {

        Adapter adapter = new Adapter();
        USB usb = new USB();
        final Output output = adapter.request(usb);

        logger.log(Level.INFO, output.description());
    }
}
