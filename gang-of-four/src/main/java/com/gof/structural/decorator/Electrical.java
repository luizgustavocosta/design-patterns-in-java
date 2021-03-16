package com.gof.structural.decorator;

import java.util.Collections;
import java.util.List;

/**
 * The type Electrical.
 */
public class Electrical extends Engine {

    /**
     * Instantiates a new Electrical.
     *
     * @param horsePower the horse power
     */
    public Electrical(int horsePower) {
        super(horsePower);
    }

    @Override
    public List<EngineType> acceptedBy() {
        return Collections.singletonList(EngineType.ELECTRICAL);
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
        return "Electrical";
    }
}
