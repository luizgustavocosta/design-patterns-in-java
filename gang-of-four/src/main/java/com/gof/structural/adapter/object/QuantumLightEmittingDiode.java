package com.gof.structural.adapter.object;

public class QuantumLightEmittingDiode implements TV {

    private final HDMIConnector input;
    private final String name;

    public QuantumLightEmittingDiode(HDMIConnector input, String name) {
        this.input = input;
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String display() {
        return "QLED";
    }

    @Override
    public ConnectorPort getInput() {
        return input;
    }

    @Override
    public String toString() {
        return "QuantumLightEmittingDiode{" +
                "input=" + input +
                ", name='" + name + '\'' +
                '}';
    }


    public static final class QuantumLightEmittingDiodeBuilder {
        private HDMIConnector input;
        private String name;

        private QuantumLightEmittingDiodeBuilder() {
        }

        public static QuantumLightEmittingDiodeBuilder aQuantumLightEmittingDiode() {
            return new QuantumLightEmittingDiodeBuilder();
        }

        public QuantumLightEmittingDiodeBuilder withInput(HDMIConnector input) {
            this.input = input;
            return this;
        }

        public QuantumLightEmittingDiodeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public QuantumLightEmittingDiode build() {
            return new QuantumLightEmittingDiode(input, name);
        }
    }
}
