package com.gof.structural.adapter.domain;

public class Console<T extends ConnectorPort> {

    private final String manufacturer;
    private final String name;
    private final String productFamily;
    private T output;

    public Console(String manufacturer, String productFamily, String name, T output) {
        this.manufacturer = manufacturer;
        this.productFamily = productFamily;
        this.name = name;
        this.output = output;
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

    public T getOutput() {
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
}
