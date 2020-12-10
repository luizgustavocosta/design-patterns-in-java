package com.gof.creational.abstract_factory.ap;

import com.gof.creational.abstract_factory.Devices;
import com.gof.creational.abstract_factory.ap.OfficeSuite;
import com.gof.creational.abstract_factory.license.License;
import com.gof.creational.abstract_factory.license.Paid;

import java.util.Set;

public interface ICloud extends OfficeSuite {

    Set<Devices> allowedDevices();

    default License getLicense() {
        return new Paid();
    }

    @Override
    default String print() {
        StringBuilder builder= new StringBuilder();
        builder.append("\nWelcome to iCloud world");
        builder.append("\nThe Office suite is available on the following devices "+allowedDevices());
        return builder.toString();
    }
}
