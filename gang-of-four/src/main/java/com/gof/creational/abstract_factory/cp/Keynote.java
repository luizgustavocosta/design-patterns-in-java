package com.gof.creational.abstract_factory.cp;

import com.gof.creational.abstract_factory.Devices;
import com.gof.creational.abstract_factory.ap.ICloud;

import java.math.BigDecimal;
import java.util.Set;

public class Keynote implements ICloud {

    @Override
    public Set<Devices> allowedDevices() {
        return null;
    }

    @Override
    public BigDecimal price() {
        return null;
    }
}
