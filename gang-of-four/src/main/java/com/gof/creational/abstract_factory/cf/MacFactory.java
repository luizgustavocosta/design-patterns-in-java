package com.gof.creational.abstract_factory.cf;

import com.gof.creational.abstract_factory.AbstractFactory;
import com.gof.creational.abstract_factory.ap.OfficeSuite;
import com.gof.creational.abstract_factory.ap.OperationalSystem;
import com.gof.creational.abstract_factory.cp.Keynote;
import com.gof.creational.abstract_factory.cp.MacOS;
import com.gof.creational.abstract_factory.cp.Numbers;
import com.gof.creational.abstract_factory.cp.Pages;
import com.gof.creational.abstract_factory.license.License;
import com.gof.creational.abstract_factory.license.Proprietary;

import java.util.Arrays;
import java.util.List;

public class MacFactory implements AbstractFactory {

    private final OperationalSystem operationalSystem;

    public MacFactory() {
        this.operationalSystem = new MacOS();
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
        return Arrays.asList(
                new Pages(),
                new Numbers(),
                new Keynote());

    }
}
