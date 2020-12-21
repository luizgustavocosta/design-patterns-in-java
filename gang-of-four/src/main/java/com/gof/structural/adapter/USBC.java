package com.gof.structural.adapter;
/*
https://en.wikipedia.org/wiki/USB-C
 */
public class USBC implements Output {

    @Override
    public String description() {
        return "Pins of the USB-C connector"+
                "Type\tDigital audio / video / data connector / power"+
                "Designer\tUSB Implementers Forum"+
                "Designed\t11 August 2014 (published)[1]"+
                "General specifications Pins\t24";
    }
}
