package com.gof.structural.adapter;

import com.gof.structural.adapter.domain.DeviceFactory;
import com.gof.structural.adapter.twoway.HDMIRCATwoWayAdapter;

import java.util.logging.Level;
import java.util.logging.Logger;

public class AppTwoWaysClient {

    private static final Logger logger = Logger.getLogger(AppTwoWaysClient.class.getName());

    public static void main(String[] args) {

        final String qLedMegaDrive = DeviceFactory.createQLedTV()
                .plug(new HDMIRCATwoWayAdapter(DeviceFactory.createMegaDrive().getOutput()));

        logger.log(Level.INFO, qLedMegaDrive);

        final String qLedPS5 = DeviceFactory.createQLedTV3D()
                .plug(new HDMIRCATwoWayAdapter(DeviceFactory.createPSFive().getOutput()));

        logger.log(Level.INFO, qLedPS5);

        final String vintageSNes = DeviceFactory.createVintageTV()
                .plug(new HDMIRCATwoWayAdapter(DeviceFactory.createSNES().getOutput()));

        logger.log(Level.INFO, vintageSNes);

    }
}
