package com.gof.structural.adapter.object;

/**
 * The type High speed hdmi.
 */
public class HighSpeedHDMI implements HDMI {

    @Override
    public boolean connect() {
        // Doing a lot of funny things in a real world
        return true;
    }

    @Override
    public void compress() {
        //compress audio and video
    }

    @Override
    public void uncompressed() {
        //uncompressed audio and video
    }

    @Override
    public CableSize size() {
        return CableSize.REGULAR;
    }
}
