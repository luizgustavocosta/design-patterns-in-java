package com.gof.creational.abstract_factory;

import com.gof.creational.abstract_factory.ap.OfficeSuite;
import com.gof.creational.abstract_factory.ap.OperationalSystem;
import com.gof.creational.abstract_factory.ap.Report;
import com.gof.creational.abstract_factory.license.License;

import java.util.List;

public interface  AbstractFactory {

    OperationalSystem createOperationalSystem();
    License createLicense();
    List<OfficeSuite> createOfficeSuite();
    Report createOrderReport();

}
