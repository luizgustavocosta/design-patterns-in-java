package com.gof.structural.adapter.domain;

import com.gof.structural.adapter.object.HDMIAdapter;
import com.gof.structural.adapter.twoway.HDMIRCATwoWayAdapter;

import java.util.logging.Level;
import java.util.logging.Logger;

@Deprecated
public class PlugAndPlay {

    private static final Logger logger = Logger.getLogger(PlugAndPlay.class.getName());

    private PlugAndPlay() {
        throw new IllegalCallerException("Private constructor");
    }

    public static void universalConnect(TV tv, Console console) {
        if (console.getOutput() instanceof HDMIConnector) {
            log(new HDMIRCATwoWayAdapter((HDMI) console.getOutput()).connectCable());
        } else {
            log(new HDMIRCATwoWayAdapter((RCA) console.getOutput()).connectCables());
        }
    }

    public static void connect(TV tv, Console console) {
        if (tv.getInput().equals(console.getOutput())) {
            log(String.format("%s%s%s%s%s",
                    "Tv ",
                    tv.name(),
                    ", and the console ",
                    console.name(),
                    " has the same interface. No adapter required."));
        } else {
            log("Let's try connect different interfaces..");

            if (console.getOutput() instanceof HDMI) {
                log(new HDMIAdapter((HDMI) console.getOutput())
                        .connectCables());
            }
        }
    }

    private static void log(String message) {
        logger.log(Level.INFO, message);
    }
}
