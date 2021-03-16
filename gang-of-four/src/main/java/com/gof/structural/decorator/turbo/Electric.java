package com.gof.structural.decorator.turbo;

import com.gof.structural.decorator.Engine;
import com.gof.structural.decorator.EngineType;
import com.gof.structural.decorator.TurboCharger;

import java.util.Collections;

/**
 * The type Electric.
 */
public class Electric extends TurboCharger {

    /**
     * Instantiates a new Electric.
     *
     * @param engine the engine
     */
    public Electric(Engine engine) {
        super(engine, Collections.singletonList(EngineType.ELECTRICAL));
        this.engine = engine;
    }

    /**
     * Is possible by software
     * @return int
     */
    @Override
    public int horsePower() {
        return addHorsePower.applyAsInt(0.5);
    }

}
