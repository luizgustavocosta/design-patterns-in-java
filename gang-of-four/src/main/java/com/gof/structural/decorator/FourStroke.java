package com.gof.structural.decorator;

import java.util.Arrays;
import java.util.List;

/**
 * The type Four stroke.
 */
public class FourStroke extends Engine {

    /**
     * Instantiates a new Four stroke.
     *
     * @param horsePower the horse power
     */
    public FourStroke(int horsePower) {
        super(horsePower);
    }

    @Override
    public List<EngineType> acceptedBy() {
        return
                Arrays.asList(EngineType.REACTION,
                        EngineType.THERMAL_EC,
                        EngineType.THERMAL_IC);
    }

    /**
     * @return hp
     */
    @Override
    public int horsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "FourStroke";
    }
}
