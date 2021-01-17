package com.gof.structural.adapter;

import com.gof.structural.adapter.clazz.RCAClassAdapter;
import com.gof.structural.adapter.domain.*;

public class AppTwoWaysClient {

    //private static final Logger logger = Logger.getLogger(AppTwoWaysClient.class.getName());

    public static void main(String[] args) {
        TV<RCAConnector> crtTV = new CathodeRayTube(RCA.getInstance(), "Grandmother's tv");

        TV<HDMIConnector> qLed = new QuantumLightEmittingDiode(HDMI.getInstance(), "LG 100 last generation 3D");

        Console<HDMIConnector> xbox = new Console("Microsoft", "Xbox X", "Xbox One", HDMI.getInstance());

        Console<RCAClassAdapter> sNes = new Console("Nintendo", "NES", "SNES 16bit", RCA.getInstance());

        PlugAndPlay.universalConnect(crtTV, xbox);
        PlugAndPlay.universalConnect(crtTV, sNes);
        PlugAndPlay.universalConnect(qLed, sNes);

    }
}
