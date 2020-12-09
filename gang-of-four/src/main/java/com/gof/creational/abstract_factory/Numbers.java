package com.gof.creational.abstract_factory;

import java.util.Collections;
import java.util.Set;

public class Numbers implements ICloud {

    @Override
    public Set<Devices> allowedDevices() {
        return Collections.singleton(Devices.COMPUTER);
    }
}
