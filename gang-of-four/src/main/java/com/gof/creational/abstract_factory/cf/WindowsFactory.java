package com.gof.creational.abstract_factory.cf;

import com.gof.creational.abstract_factory.AbstractFactory;
import com.gof.creational.abstract_factory.ap.OfficeSuite;
import com.gof.creational.abstract_factory.ap.OperationalSystem;
import com.gof.creational.abstract_factory.cp.*;
import com.gof.creational.abstract_factory.license.License;
import com.gof.creational.abstract_factory.license.Proprietary;

import java.util.Arrays;
import java.util.List;

public class WindowsFactory implements AbstractFactory {

    private final OperationalSystem operationalSystem;

    public WindowsFactory() {
        this.operationalSystem = new Windows10();
    }

    @Override
    public OperationalSystem createOperationalSystem() {
        return operationalSystem;
    }

    @Override
    public License createLicense() {
        return new Proprietary();
    }

    @Override
    public List<OfficeSuite> createOfficeSuite() {
        return Arrays.asList(new Word(),
                new Excel(), new PowerPoint(), new Access());
    }
}
