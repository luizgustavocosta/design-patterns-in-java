package com.gof.structural.adapter.object;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlugAndPlay {

    private static final Logger logger = Logger.getLogger(PlugAndPlay.class.getName());

    private PlugAndPlay() {
        throw new IllegalCallerException("Private constructor");
    }

    public static boolean connect(TV tv, Console console) {
        Objects.requireNonNull(tv, "The tv is required");
        Objects.requireNonNull(console, "The console is required");

        if (tv.videoInput().getClass().isInstance(console.getVideoOutput())) {
            logger.log(Level.INFO, "Equals. Adapter not required");
        } else {
            logger.log(Level.INFO, () -> "Not Equals. Lets call the adapter for a old TV");

            final ConnectorPort videoOutput = console.getVideoOutput();
            if (videoOutput instanceof HDMI) {
                return new HDMIAdapter((HDMI) videoOutput).ready();
            }
        }
        return true;
    }
}
