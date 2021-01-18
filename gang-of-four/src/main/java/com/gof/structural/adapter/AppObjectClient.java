package com.gof.structural.adapter;

import com.gof.structural.adapter.domain.DeviceFactory;
import com.gof.structural.adapter.object.HDMIAdapter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AppObjectClient {

    private static final Logger logger = Logger.getLogger(AppObjectClient.class.getName());

    public static void main(String[] args) {
        logger.log(Level.INFO, "Starting the Adapter pattern");

        final String vintageAndPS5 = DeviceFactory.createVintageTV()
                .plug(new HDMIAdapter(DeviceFactory.createPSFive().getOutput()));
        logger.log(Level.INFO, vintageAndPS5);

        final String vintageAndXbox = DeviceFactory.createVintageTV()
                .plug(new HDMIAdapter(DeviceFactory.createXBoxOne().getOutput()));
        logger.log(Level.INFO, vintageAndXbox);

    }
}
