package com.gof.behavioral.decorator.turbo;

import com.gof.behavioral.decorator.Engine;
import com.gof.behavioral.decorator.EngineType;
import com.gof.behavioral.decorator.TurboCharger;

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
