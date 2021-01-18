package com.gof.structural.adapter.domain;

public class DeviceFactory {

    public static Console<RCAConnector> createPSOne() {
        return new Console<>("Sony", "Playstation", "PS One", RCA.getInstance());
    }

    public static Console<HDMIConnector> createPSFive() {
        return new Console<>("Sony", "Playstation", "PS Five", HDMI.getInstance());
    }

    public static Console<HDMIConnector> createXBoxOne() {
        return new Console<>("Microsoft", "Xbox", "Xbox One", HDMI.getInstance());
    }

    public static Console<RCAConnector> createSNES() {
        return new Console<>("Nintendo", "NES", "Super Nes 16 bit", RCA.getInstance());
    }

    public static Console<RCAConnector> createMegaDrive() {
        return new Console<>("Sega", "MD", "Mega Drive Genesis", RCA.getInstance());
    }

    public static TV<RCAConnector> createVintageTV() {
        return new CathodeRayTube("90s TV", RCA.getInstance());
    }

    public static TV<HDMIConnector> createQLedTV() {
        return new QuantumLightEmittingDiode("LG 150", HDMI.getInstance());
    }

    public static TV<HDMIConnector> createQLedTV3D() {
        return new QuantumLightEmittingDiode("LG 200 3D", HDMI.getInstance());
    }

}
