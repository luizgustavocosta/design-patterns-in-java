package com.gof.behavioral.decorator.turbo;

import com.gof.behavioral.decorator.Engine;
import com.gof.behavioral.decorator.EngineType;
import com.gof.behavioral.decorator.TurboCharger;

import java.util.Collections;

/**
 * The type Single.
 * Single turbochargers alone have limitless variability.
 * Differing the compressor wheel size and turbine will lead to completely different torque characteristics.
 * Large turbos will bring on high top-end power, but smaller turbos will provide better low-end grunt as they spool faster.
 * There are also ball bearing and journal bearing single turbos.
 * Ball bearings provide less friction for the compressor and turbine to spin on, thus are faster to spool (while adding cost).
 */
public class Single extends TurboCharger {

    /**
     * Instantiates a new Single.
     *
     * @param engine the engine
     */
    public Single(Engine engine) {
        super(engine, Collections.singletonList(EngineType.THERMAL_EC));
    }

    @Override
    public int horsePower() {
        return addHorsePower.applyAsInt(2.5);
    }
}
