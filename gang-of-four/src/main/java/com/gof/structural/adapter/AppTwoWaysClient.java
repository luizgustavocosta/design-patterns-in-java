package com.gof.structural.adapter;

import com.gof.structural.adapter.object.*;

public class AppTwoWaysClient {

    //private static final Logger logger = Logger.getLogger(AppTwoWaysClient.class.getName());

    public static void main(String[] args) {
        TV crtTV = CathodeRayTube.CathodeRayTubeBuilder.aCathodeRayTube()
                .withVideoInput(RCA.getInstance())
                .withName("Grandmother's tv")
                .build();

        TV qLed = QuantumLightEmittingDiode.QuantumLightEmittingDiodeBuilder.aQuantumLightEmittingDiode()
                .withInput(HDMI.getInstance())
                .withName("LG 100 last generation 3D")
                .build();

        Console xbox = Console.ConsoleBuilder.aConsole()
                .withName("Xbox X")
                .withManufacturer("Microsoft")
                .withProductFamily("Microsoft Xbox")
                .withVideoOutput(HDMI.getInstance())
                .build();

        Console sNes = Console.ConsoleBuilder.aConsole()
                .withName("Super Nintendo")
                .withManufacturer("Nintendo")
                .withProductFamily("NES")
                .withVideoOutput(RCA.getInstance())
                .build();

        PlugAndPlay.universalConnect(crtTV, xbox);
        PlugAndPlay.universalConnect(crtTV, sNes);
        PlugAndPlay.universalConnect(qLed, sNes);

    }
}
