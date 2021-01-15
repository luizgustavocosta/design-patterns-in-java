package com.gof.structural.adapter.object;

/**
 * https://www.cablestogo.com/tech/hdmi-2
 */
public interface HDMI {
    boolean connect();
    CableSize size();
    void compress();
    void uncompressed();
}
