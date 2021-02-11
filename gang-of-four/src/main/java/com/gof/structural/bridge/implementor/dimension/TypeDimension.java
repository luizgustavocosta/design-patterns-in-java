package com.gof.structural.bridge.implementor.dimension;

public enum TypeDimension {

    DRY(new Dimension(
            new ContainerWeight(24_000f, 2_370f, 21_630f),
            new InteriorMeasurement(5_898f, 2_352f, 2_394f, 33.20f),
            new DoorOpen(2_343f, 2_280f)),
            "Manufactured from either aluminium or steel, they are suitable for most type of cargo"),
    HIGH(new Dimension(
            new ContainerWeight(30_480f, 3_980f, 26_500f),
            new InteriorMeasurement(12_031f, 2_352f, 2_698f, 76.30f),
            new DoorOpen(2_340f, 2_585f)),
            "With high cube containers, you gain an extra foot in height compared with general-purpose containers"),
    REFRIGERATED(new Dimension(
            new ContainerWeight(24_00f, 3_050f, 20_950f),
            new InteriorMeasurement(5_449f, 2_290f, 2_244f, 26.70f),
            new DoorOpen(2_276f, 2_261f)),
            "Recommended for delicate cargo. Bottom-air delivery system ensures refrigerated cargo reaches its destination in optimum condition");

    private final Dimension dimension;
    private final String characteristics;

    TypeDimension(Dimension dimension, String characteristics) {
        this.dimension = dimension;
        this.characteristics = characteristics;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getCharacteristics() {
        return characteristics;
    }
}
