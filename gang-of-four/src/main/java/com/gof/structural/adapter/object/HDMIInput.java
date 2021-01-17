package com.gof.structural.adapter.object;

public class HDMIInput implements HDMIConnector{

    private final String name;
    private final int connectors;
    private final String speed;

    public HDMIInput(String name, int connectors, String speed) {
        this.name = name;
        this.connectors = connectors;
        this.speed = speed;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int connectors() {
        return connectors;
    }

    @Override
    public String speed() {
        return speed;
    }


    public static final class HDMIInputBuilder {
        private String name;
        private int connectors;
        private String speed;

        private HDMIInputBuilder() {
        }

        public static HDMIInputBuilder aHDMIInput() {
            return new HDMIInputBuilder();
        }

        public HDMIInputBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public HDMIInputBuilder withConnectors(int connectors) {
            this.connectors = connectors;
            return this;
        }

        public HDMIInputBuilder withSpeed(String speed) {
            this.speed = speed;
            return this;
        }

        public HDMIInput build() {
            return new HDMIInput(name, connectors, speed);
        }
    }
}
