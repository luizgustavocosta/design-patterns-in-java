package com.gof.creational.abstract_factory;

import java.util.Set;

public interface MicrosoftOffice {

    Set<String> allowedDevices();
    Set<String> exportAs();

    default License getLicense() {
        return License.PAID;
    }

}
