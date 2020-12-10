package com.gof.creational.abstract_factory.ap;

import com.gof.creational.abstract_factory.license.License;
import com.gof.creational.abstract_factory.license.Paid;

import java.util.Set;

public interface MicrosoftOffice extends OfficeSuite {

    Set<String> allowedDevices();
    Set<String> exportAs();
    default License getLicense() {
        return new Paid();
    }

    @Override
    default String print() {
        StringBuilder builder= new StringBuilder();
        builder.append("\nThe Office suite is available on the following devices "+allowedDevices());
        builder.append("\nThe Office suite is available on the following devices "+allowedDevices());

        return builder.toString();
    }
}
