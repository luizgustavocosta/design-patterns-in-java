package com.gof.structural.adapter;

import com.gof.structural.adapter.object.*;
import com.gof.structural.adapter.twoways.CathodeRayTube;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AppObjectClient {

    private static final Logger logger = Logger.getLogger(AppObjectClient.class.getName());

    public static void main(String[] args) {

        TV vintageTV = CathodeRayTube.CathodeRayTubeBuilder.aCathodeRayTube()
                .withVideoInput(new RCA("Philips Digital Interconnect Format"))
                .withScreenType("CRT")
                .withName("Vintage tv")
                .build();

        Console playstation5 = Console.aBuilder()
                .withName("PS 5")
                .withManufacturer("Sony")
                .withProductFamily("Playstation")
                .withVideoOutput(new HDMI("High speed 2.1"))
                .build();

        Console playstation1 = Console.aBuilder()
                .withName("Play 1")
                .withManufacturer("Sony")
                .withProductFamily("Playstation")
                .withVideoOutput(new RCA("Sony RCA Cables"))
                .build();

        logConnection(PlugAndPlay.connect(vintageTV, playstation5), vintageTV, playstation5);
        logConnection(PlugAndPlay.connect(vintageTV, playstation1), vintageTV, playstation1);

    }

    private static void logConnection(boolean result, TV tv, Console console) {
        if (result) {
            logger.log(Level.INFO, "The connection the TV and the Console has been established");
        } else {
            logger.log(Level.WARNING, () -> "Fail to connect the TV {'" + tv.name() + "'}, and the Console {'" + console.name() + "'}");
        }
    }
}
