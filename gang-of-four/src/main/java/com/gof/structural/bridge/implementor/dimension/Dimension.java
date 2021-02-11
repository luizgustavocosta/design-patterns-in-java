package com.gof.structural.bridge.implementor.dimension;

public class Dimension {

    private final ContainerWeight containerWeight;
    private final InteriorMeasurement interiorMeasurement;
    private final DoorOpen doorOpen;

    public Dimension(ContainerWeight containerWeight, InteriorMeasurement interiorMeasurement, DoorOpen doorOpen) {
        this.containerWeight = containerWeight;
        this.interiorMeasurement = interiorMeasurement;
        this.doorOpen = doorOpen;
    }

    public ContainerWeight getContainerWeight() {
        return containerWeight;
    }

    public InteriorMeasurement getInteriorMeasurement() {
        return interiorMeasurement;
    }

    public DoorOpen getDoorOpen() {
        return doorOpen;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "containerWeight=" + containerWeight +
                ", interiorMeasurement=" + interiorMeasurement +
                ", doorOpen=" + doorOpen +
                '}';
    }
}

