package com.gof.creational.abstract_factory;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pages implements ICloud {

    @Override
    public Set<Devices> allowedDevices() {
        return new HashSet<>(Arrays.asList(Devices.values()));
    }
}
