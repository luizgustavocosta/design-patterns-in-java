package com.gof.creational.abstract_factory.cp;

import com.gof.creational.abstract_factory.Devices;
import com.gof.creational.abstract_factory.ap.ICloud;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pages implements ICloud {

    @Override
    public Set<Devices> allowedDevices() {
        return new HashSet<>(Arrays.asList(Devices.values()));
    }

    @Override
    public BigDecimal price() {
        return null;
    }

}
