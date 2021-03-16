package com.gof.structural.decorator.turbo;

import com.gof.structural.decorator.Engine;
import com.gof.structural.decorator.EngineType;
import com.gof.structural.decorator.TurboCharger;

import java.util.Collections;

/**
 * The type Sequential.
 */
public class Sequential extends TurboCharger {

    /**
     * Instantiates a new Sequential.
     *
     * @param engine the engine
     */
    public Sequential(Engine engine) {
        super(engine, Collections.singletonList(EngineType.REACTION));
    }

    @Override
    public int horsePower() {
        return addHorsePower.applyAsInt(0.3);
    }
}
