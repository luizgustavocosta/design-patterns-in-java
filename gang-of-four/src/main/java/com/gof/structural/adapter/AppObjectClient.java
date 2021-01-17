package com.gof.structural.adapter;

import com.gof.structural.adapter.object.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AppObjectClient {

    private static final Logger logger = Logger.getLogger(AppObjectClient.class.getName());

    public static void main(String[] args) {

        logger.log(Level.INFO, "Starting the Adapter pattern");

        TV crtTV = CathodeRayTube.CathodeRayTubeBuilder.aCathodeRayTube()
                .withVideoInput(RCA.getInstance())
                .withName("Vintage tv")
                .build();

        TV qLedTV = QuantumLightEmittingDiode.QuantumLightEmittingDiodeBuilder.aQuantumLightEmittingDiode()
                .withInput(HDMI.getInstance())
                .withName("Samsung Q80/Q80T QLED")
                .build();

        Console ps5 = Console.aBuilder()
                .withName("PS 5")
                .withManufacturer("Sony")
                .withProductFamily("Playstation")
                .withVideoOutput(HDMI.getInstance())
                .build();

        Console ps1 = Console.aBuilder()
                .withName("PS 1")
                .withManufacturer("Sony")
                .withProductFamily("Playstation")
                .withVideoOutput(RCA.getInstance())
                .build();

        PlugAndPlay.connect(crtTV, ps1);
        PlugAndPlay.connect(qLedTV, ps5);
        PlugAndPlay.connect(qLedTV, ps1);
        PlugAndPlay.connect(crtTV, ps5);

    }
}
