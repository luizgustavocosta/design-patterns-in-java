package com.gof.creational.abstract_factory.client;

import com.gof.creational.abstract_factory.AbstractFactory;
import com.gof.creational.abstract_factory.Computer;
import com.gof.creational.abstract_factory.ComputerType;
import com.gof.creational.abstract_factory.ap.OfficeSuite;
import com.gof.creational.abstract_factory.ap.OperationalSystem;
import com.gof.creational.abstract_factory.cf.MacFactory;
import com.gof.creational.abstract_factory.cf.WindowsFactory;
import com.gof.creational.abstract_factory.license.License;

import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Client {

    private static final Logger LOGGER = Logger.getLogger(Client.class.getName());

    public static void main(String[] args) {
        LOGGER.info("Starting....");
        final Client client = new Client();
        Supplier<String> supplier = () -> "Buying a computer of type ....";
        for (ComputerType computerType : ComputerType.values()) {

            Supplier<ComputerType> computerTypeSupplier = () -> computerType;
            LOGGER.info(supplier.get() + computerTypeSupplier.get());

            final Computer computer = client.createANewComputer(computerType);
            computer.print();
        }
        LOGGER.info("\nEnd.");
    }

    public Computer createANewComputer(ComputerType computerType) {
        AbstractFactory factory = getInstance(computerType);

        final License license = factory.createLicense();
        final List<OfficeSuite> officeSuite = factory.createOfficeSuite();
        final OperationalSystem operationalSystem = factory.createOperationalSystem();

        return Computer.aBuilder()
                .withLicense(license)
                .withOfficeSuite(officeSuite)
                .withOperationalSystem(operationalSystem)
                .build();
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
