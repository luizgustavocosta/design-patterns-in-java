package com.gof.creational.abstract_factory.cf;

import com.gof.creational.abstract_factory.AbstractFactory;
import com.gof.creational.abstract_factory.ap.OfficeSuite;
import com.gof.creational.abstract_factory.ap.OperationalSystem;
import com.gof.creational.abstract_factory.ap.Report;
import com.gof.creational.abstract_factory.cp.*;
import com.gof.creational.abstract_factory.license.License;
import com.gof.creational.abstract_factory.license.Paid;

import java.math.BigDecimal;
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

    public License createLicense() {
        return new Paid();
    }

    public List<OfficeSuite> createOfficeSuite() {
        return Arrays.asList(
                new Pages(),
                new Numbers(),
                new Keynote());

    }

    public BigDecimal calculatePrice() {
        return new BigDecimal(42);
    }

    public Report createOrderReport() {
        return new MacReport(operationalSystem);
    }
}
