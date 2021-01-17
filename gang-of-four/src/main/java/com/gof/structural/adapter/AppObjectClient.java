package com.gof.structural.adapter;

import com.gof.structural.adapter.domain.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AppObjectClient {

    private static final Logger logger = Logger.getLogger(AppObjectClient.class.getName());

    public static void main(String[] args) {

        logger.log(Level.INFO, "Starting the Adapter pattern");

        TV<RCAConnector> crtTV = new CathodeRayTube(RCA.getInstance(), "Vintage tv");

        TV<HDMIConnector> qLedTV = new QuantumLightEmittingDiode(HDMI.getInstance(), "Samsung Q80/Q80T QLED");

        Console<HDMIConnector> ps5 = new Console("Sony", "Playstation", "PS5", HDMI.getInstance());

        Console<RCAConnector> ps1 = new Console("Sony", "Playstation", "PS1", RCA.getInstance());

        PlugAndPlay.connect(crtTV, ps1);
        PlugAndPlay.connect(qLedTV, ps5);
        PlugAndPlay.connect(qLedTV, ps1);
        PlugAndPlay.connect(crtTV, ps5);

    }
}
