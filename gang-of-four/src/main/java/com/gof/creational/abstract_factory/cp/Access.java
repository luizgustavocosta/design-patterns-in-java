package com.gof.creational.abstract_factory.cp;

import com.gof.creational.abstract_factory.Devices;
import com.gof.creational.abstract_factory.ap.MicrosoftOffice;

import java.util.Collections;
import java.util.Set;

public class Access implements MicrosoftOffice {

    @Override
    public Set<Devices> allowedDevices() {
        return Collections.singleton(Devices.COMPUTER);
    }

    @Override
    public String print() {
        return "Microsoft Access is a database management system from Microsoft that combines the relational Microsoft " +
                "Jet Database Engine with a graphical user interface and software-development tools";
    }
}
