package com.gof.creational.abstract_factory.cp;

import com.gof.creational.abstract_factory.Devices;
import com.gof.creational.abstract_factory.ap.MicrosoftOffice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Excel implements MicrosoftOffice {

    @Override
    public Set<Devices> allowedDevices() {
        return new HashSet<>(Arrays.asList(Devices.values()));
    }

    @Override
    public String print() {
        return "Microsoft Excel is a spreadsheet developed by Microsoft for Windows, macOS, Android and iOS. " +
                "It features calculation, graphing tools, pivot tables, and a macro programming language called " +
                "Visual Basic for Applications";
    }
}
