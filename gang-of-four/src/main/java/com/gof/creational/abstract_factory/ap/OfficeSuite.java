package com.gof.creational.abstract_factory.ap;

import com.gof.creational.abstract_factory.Devices;

import java.util.Set;

public interface OfficeSuite {

    Set<Devices> allowedDevices();

    String print();
}
