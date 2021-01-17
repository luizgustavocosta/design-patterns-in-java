package com.gof.structural.adapter;

import com.gof.structural.adapter.clazz.RCAClassAdapter;
import com.gof.structural.adapter.domain.*;
import com.gof.structural.adapter.object.HDMIAdapter;

public class AppClassClient {

    public static void main(String[] args) {

        final QuantumLightEmittingDiode qLedTv = new QuantumLightEmittingDiode(HDMI.getInstance(), "Philips 200");

        final Console<HDMIConnector> xboxOne = new Console<>("Sony", "Playstation", "Playstation 5", HDMI.getInstance());
        final Console<RCAConnector> megaDrive = new Console<>("Mega Drive", "Mega Drive", "X", RCA.getInstance());
        final Console<RCAConnector> test =
                new Console<>("Microsoft", "Xbox", "Xbox One", RCA.getInstance());
        final Console<HDMIConnector> play5 = new Console<>("Microsoft", "Xbox", "Xbox One", HDMI.getInstance());

        HDMIConnector megaDriveInHDMIMode = new RCAClassAdapter();

        final String message = qLedTv.plug(play5.getOutput());
        final String otherMessage = qLedTv.plug(megaDriveInHDMIMode);
        RCAConnector rca = new HDMIAdapter(xboxOne.getOutput());


        playTime(qLedTv);


    }

    private static void playTime(TV tv) {
        System.out.println(tv.name());
        System.out.println(tv.display());
        System.out.println(tv.getInput());
    }
}
