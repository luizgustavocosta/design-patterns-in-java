package com.gof.creational.abstract_factory.cp;

import com.gof.creational.abstract_factory.Devices;
import com.gof.creational.abstract_factory.ap.MicrosoftOffice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PowerPoint implements MicrosoftOffice {
    @Override
    public Set<Devices> allowedDevices() {
        return new HashSet<>(Arrays.asList(Devices.values()));
    }

    @Override
    public String print() {
        return "Microsoft PowerPoint is a presentation program, created by Robert Gaskins and Dennis Austin at a " +
                "software company named Forethought, Inc.";
    }
}
