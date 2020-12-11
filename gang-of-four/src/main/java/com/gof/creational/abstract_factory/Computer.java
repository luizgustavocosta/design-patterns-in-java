package com.gof.creational.abstract_factory;

import com.gof.creational.abstract_factory.ap.OfficeSuite;
import com.gof.creational.abstract_factory.ap.OperationalSystem;
import com.gof.creational.abstract_factory.license.License;

import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class Computer {

    private static final Logger LOGGER = Logger.getLogger(Computer.class.getName());

    private final License license;
    private final List<OfficeSuite> officeSuite;
    private final OperationalSystem operationalSystem;

    private Computer(License license, List<OfficeSuite> officeSuite, OperationalSystem operationalSystem) {
        this.license = license;
        this.officeSuite = officeSuite;
        this.operationalSystem = operationalSystem;
    }

    public static ComputerBuilder aBuilder() {
        return new ComputerBuilder();
    }

    public License getLicense() {
        return license;
    }

    public List<OfficeSuite> getOfficeSuite() {
        return officeSuite;
    }

    public OperationalSystem getOperationalSystem() {
        return operationalSystem;
    }

    public void print() {
        StringBuilder builder = new StringBuilder();
        builder.append(operationalSystem.releaseNotes())
                .append(license.print())
                .append("\n")
                .append("\nOffice Suite")
                .append(officeSuite.stream()
                        .map(software -> "\n* " + software.print() +
                                "\nAllowed devices => " + software.allowedDevices())
                        .collect(Collectors.joining()))
                .append("\n");

        Supplier<String> report = builder::toString;
        LOGGER.info(report);
    }

    public static final class ComputerBuilder {
        private License license;
        private List<OfficeSuite> officeSuite;
        private OperationalSystem operationalSystem;

        private ComputerBuilder() {
        }

        public ComputerBuilder withLicense(License license) {
            this.license = license;
            return this;
        }

        public ComputerBuilder withOfficeSuite(List<OfficeSuite> officeSuite) {
            this.officeSuite = officeSuite;
            return this;
        }

        public ComputerBuilder withOperationalSystem(OperationalSystem operationalSystem) {
            this.operationalSystem = operationalSystem;
            return this;
        }

        public Computer build() {
            return new Computer(license, officeSuite, operationalSystem);
        }
    }
}
