package com.gof.creational.abstract_factory.cp;

import com.gof.creational.abstract_factory.Devices;
import com.gof.creational.abstract_factory.ap.MicrosoftOffice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Word implements MicrosoftOffice {

    @Override
    public Set<Devices> allowedDevices() {
        return new HashSet<>(Arrays.asList(Devices.values()));
    }

    @Override
    public String print() {
        return "Microsoft Word is a word processor developed by Microsoft. It was first released on October 25, 1983 " +
                "under the name Multi-Tool Word for Xenix systems.";
    }
}
