package com.gof.creational.abstract_factory;

import java.util.Set;

public class PowerPoint implements MicrosoftOffice {
    @Override
    public Set<String> allowedDevices() {
        return null;
    }

    @Override
    public Set<String> exportAs() {
        return null;
    }
}
