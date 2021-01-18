package com.gof.structural.adapter;

import com.gof.structural.adapter.clazz.RCAClassAdapter;
import com.gof.structural.adapter.domain.Console;
import com.gof.structural.adapter.domain.DeviceFactory;
import com.gof.structural.adapter.domain.RCAConnector;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AppClassClient {

    private static final Logger logger = Logger.getLogger(AppClassClient.class.getName());


    public static void main(String[] args) {

        final Console<RCAConnector> megaDrive = DeviceFactory.createMegaDrive();
        final String message = DeviceFactory.createQLedTV().plug(new RCAClassAdapter(megaDrive.getOutput()));

        logger.log(Level.INFO, message);
    }

}
