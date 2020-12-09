package com.gof.creational.abstract_factory;

import java.util.Set;

public interface ICloud {

    Set<Devices> allowedDevices();

    default License getLicense() {
        return License.PROPRIETARY;
    }
}
