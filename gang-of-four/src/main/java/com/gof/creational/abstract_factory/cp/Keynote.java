package com.gof.creational.abstract_factory.cp;

import com.gof.creational.abstract_factory.Devices;
import com.gof.creational.abstract_factory.ap.IWork;

import java.util.Set;

public class Keynote implements IWork {

    @Override
    public Set<Devices> allowedDevices() {
        return null;
    }

    @Override
    public String print() {
        return "Keynote is a presentation software application developed as a part of the iWork productivity suite by Apple Inc.";
    }
}
