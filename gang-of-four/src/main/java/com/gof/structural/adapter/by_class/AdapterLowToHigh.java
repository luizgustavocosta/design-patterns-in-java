package com.gof.structural.adapter.by_class;

/**
 * The type Adapter low to high.
 */
public class AdapterLowToHigh implements RCA {

    private final HDMI hdmi;

    /**
     * Instantiates a new Adapter low to high.
     */
    public AdapterLowToHigh() {
        this.hdmi = new HighSpeedHDMI();
    }

    @Override
    public boolean connect() {
        return hdmi.connect();
    }

}
