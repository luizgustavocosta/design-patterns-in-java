package com.gof.structural.adapter.object;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlugAndPlay {

    private static final Logger logger = Logger.getLogger(PlugAndPlay.class.getName());

    private PlugAndPlay() {
        throw new IllegalCallerException("Private constructor");
    }

    public static void connect(TV tv, Console console) {

        Objects.requireNonNull(tv, "The tv is required");
        Objects.requireNonNull(console, "The console is required");

        if (tv.getInput().name().equals(console.getOutput().name())) {
            logger.log(Level.INFO, () -> "Tv " + tv.name() + ", and Console " + console.name() + " " +
                    "has the same interface. No adapter required.");
        } else {
            logger.log(Level.INFO, () -> "Let's try connect different interfaces..");
            final ConnectorPort output = console.getOutput();
            if (output instanceof HDMI) {
                final boolean receivingSignal = new HDMIAdapter((HDMI) output).receiveSignal();
                if (receivingSignal) {
                    logger.log(Level.INFO, () -> "Tv " + tv.name() + ", and Console " + console.name() + " " +
                            "connected by an Adapter");
                } else {
                    logger.log(Level.WARNING, () -> "Please, change your Tv " + tv.name() + ", or the  Console " + console.name() + " " +
                            "to a known interface");
                }
            }
        }
    }
}
