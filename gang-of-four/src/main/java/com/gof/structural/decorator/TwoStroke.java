package com.gof.structural.decorator;

import java.util.Arrays;
import java.util.List;

import static com.gof.structural.decorator.EngineType.REACTION;
import static com.gof.structural.decorator.EngineType.THERMAL_EC;

/**
 * The type Two stroke.
 */
public class TwoStroke extends Engine {

    /**
     * Instantiates a new Two stroke.
     *
     * @param horsePower the horse power
     */
    public TwoStroke(int horsePower) {
        super(horsePower);
    }

    @Override
    public List<EngineType> acceptedBy() {
        return Arrays.asList(REACTION, THERMAL_EC);
    }

    /**
     * @return int
     */
    @Override
    public int horsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "TwoStroke";
    }
}
