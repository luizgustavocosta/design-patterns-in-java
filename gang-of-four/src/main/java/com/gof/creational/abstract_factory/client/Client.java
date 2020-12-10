package com.gof.creational.abstract_factory.client;

import com.gof.creational.abstract_factory.AbstractFactory;
import com.gof.creational.abstract_factory.ComputerType;
import com.gof.creational.abstract_factory.ap.OfficeSuite;
import com.gof.creational.abstract_factory.cf.MacFactory;
import com.gof.creational.abstract_factory.cf.WindowsFactory;
import com.gof.creational.abstract_factory.license.License;

import java.util.List;

public class Client {

    private AbstractFactory abstractFactory;
    private OfficeSuite officeSuite;

    public static void main(String[] args) {
        final Client client = new Client();


        System.out.println("Buying a Mac");
        client.createAMachine(ComputerType.APPLE);
        System.out.println("\n\nBuying a Windows");
        client.createAMachine(ComputerType.WINDOWS);
    }

    public void createAMachine(ComputerType computerType) {
        AbstractFactory factory = getInstance(computerType);
        final License license = factory.createLicense();
        final List<OfficeSuite> officeSuite = factory.createOfficeSuite();
        factory.createOperationalSystem();
        System.out.println(factory.createOrderReport().print());
        System.out.println(license.print());
        System.out.println(officeSuite);
    }

    private AbstractFactory getInstance(ComputerType computerType) {
        switch (computerType) {
            case WINDOWS:
                return new WindowsFactory();
            case APPLE:
                return new MacFactory();
            default:
                throw new IllegalArgumentException("Argument " + computerType + " not supported");
        }
    }

}
