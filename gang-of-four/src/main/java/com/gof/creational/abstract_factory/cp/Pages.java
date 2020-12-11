package com.gof.creational.abstract_factory.cp;

import com.gof.creational.abstract_factory.Devices;
import com.gof.creational.abstract_factory.ap.IWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pages implements IWork {

    @Override
    public Set<Devices> allowedDevices() {
        return new HashSet<>(Arrays.asList(Devices.values()));
    }

    @Override
    public String print() {
        return "Pages is a word processor developed by Apple Inc. It is part of the iWork productivity suite and runs on the macOS, " +
                "iPadOS, and iOS operating systems. It is also available on iCloud on the web";
    }
}
