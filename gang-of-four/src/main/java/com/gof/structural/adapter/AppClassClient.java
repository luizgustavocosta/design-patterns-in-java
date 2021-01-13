package com.gof.structural.adapter;

import com.gof.structural.adapter.by_class.AdapterLowToHigh;

/**
 * The type App class client.
 */
public class AppClassClient {


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        final boolean connected = new AdapterLowToHigh().connect();

        if (connected) {
            System.out.println("The connection between RCA and HDMI has been established");
        } else {
            System.err.println("Fail to connect RCA and HDMI");
        }
    }
}
