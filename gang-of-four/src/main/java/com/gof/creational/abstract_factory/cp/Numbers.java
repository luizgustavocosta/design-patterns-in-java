package com.gof.creational.abstract_factory.cp;

import com.gof.creational.abstract_factory.Devices;
import com.gof.creational.abstract_factory.ap.IWork;

import java.util.Collections;
import java.util.Set;

public class Numbers implements IWork {

    @Override
    public Set<Devices> allowedDevices() {
        return Collections.singleton(Devices.COMPUTER);
    }

    @Override
    public String print() {
        return "Numbers is a spreadsheet application developed by Apple Inc. as part of the iWork productivity suite alongside Keynote and Pages.";
    }
}
