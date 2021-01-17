package com.gof.structural.adapter.object;

public class Console {

    private final String manufacturer;
    private final String name;
    private final String productFamily;
    private final ConnectorPort output;

    private Console(String manufacturer, String productFamily, ConnectorPort output, String name) {
        this.manufacturer = manufacturer;
        this.productFamily = productFamily;
        this.output = output;
        this.name = name;
    }

    public static ConsoleBuilder aBuilder() {
        return new ConsoleBuilder();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getProductFamily() {
        return productFamily;
    }

    public String name() {
        return this.name;
    }

    public ConnectorPort getOutput() {
        return output;
    }

    @Override
    public String toString() {
        return "Console{" +
                "manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", productFamily='" + productFamily + '\'' +
                ", videoOutput=" + output +
                '}';
    }

    public static final class ConsoleBuilder {
        private String manufacturer;
        private String name;
        private String productFamily;
        private ConnectorPort videoOutput;

        private ConsoleBuilder() {
        }

        public static ConsoleBuilder aConsole() {
            return new ConsoleBuilder();
        }

        public ConsoleBuilder withManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public ConsoleBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ConsoleBuilder withProductFamily(String productFamily) {
            this.productFamily = productFamily;
            return this;
        }

        public ConsoleBuilder withVideoOutput(ConnectorPort videoOutput) {
            this.videoOutput = videoOutput;
            return this;
        }

        public Console build() {
            return new Console(manufacturer, productFamily, videoOutput, name);
        }
    }
}
