package com.gof.structural.adapter;

import com.gof.structural.adapter.object.AdapterLowToHigh;
import org.jboss.logmanager.Level;

import java.util.logging.Logger;

/**
 * The type App class client.
 */
public class AppClassClient {

    private static final Logger logger = Logger.getLogger(AppClassClient.class.getName());

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        final boolean connected = new AdapterLowToHigh().connect();

        if (connected) {
            logger.log(Level.INFO,"The connection between RCA and HDMI has been established");
        } else {
            logger.log(Level.ERROR, "Fail to connect RCA and HDMI");
        }
    }
}
