package com.gof.structural.adapter;

public class HDMI implements Output {
    @Override
    public String description() {
        return "HDMI";
    }
}
