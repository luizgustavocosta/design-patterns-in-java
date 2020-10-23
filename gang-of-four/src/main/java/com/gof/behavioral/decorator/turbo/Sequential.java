package com.gof.behavioral.decorator.turbo;

import com.gof.behavioral.decorator.Engine;
import com.gof.behavioral.decorator.EngineType;
import com.gof.behavioral.decorator.TurboCharger;

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
