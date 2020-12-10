package com.gof.creational.abstract_factory.cp;

import com.gof.creational.abstract_factory.ap.MicrosoftOffice;

import java.math.BigDecimal;
import java.util.Set;

public class Excel implements MicrosoftOffice {

    @Override
    public Set<String> allowedDevices() {
        return null;
    }

    @Override
    public Set<String> exportAs() {
        return null;
    }

    @Override
    public BigDecimal price() {
        return BigDecimal.ONE;
    }
}
