package com.gof.behavioral.decorator;

import java.util.Collections;
import java.util.List;
import java.util.function.DoubleToIntFunction;

/**
 * The type Turbo Charger
 */
public abstract class TurboCharger extends Engine {

    /**
     * The Engine.
     */
    protected Engine engine;

    /**
     * The Engines allowed.
     */
    protected final List<EngineType> enginesAllowed;

    /**
     * Instantiates a new Tuning.
     *
     * @param engine         the engine
     * @param enginesAllowed the engine types
     */
    protected TurboCharger(Engine engine, List<EngineType> enginesAllowed) {
        super(engine.horsePower);
        this.engine = engine;
        this.enginesAllowed = enginesAllowed;
    }

    @Override
    public List<EngineType> acceptedBy() {
        return Collections.emptyList();
    }

    /**
     * Is allowed boolean.
     *
     * @return the boolean
     */
    public boolean isAllowed() {
        return engine.acceptedBy()
                .stream()
                .anyMatch(enginesAllowed::contains);
    }

    /**
     * The Add horse power.
     * If allowed add the desired power otherwise none is added
     */
    protected DoubleToIntFunction addHorsePower = hpToBeApplied -> isAllowed() ?
            engine.horsePower() + (int) (engine.horsePower() * hpToBeApplied) :
            0;

    @Override
    public String toString() {
        int currentHp = this.horsePower();
        int initialHp = engine.horsePower;
        int added = currentHp == 0 ? 0 : currentHp - initialHp;
        return "TurboCharger{" +
                "engine=" + engine +
                ", enginesAllowed=" + enginesAllowed +
                ", Horse Power initial=[" + initialHp +
                "], added=[" + added +
                "], total=" + (added + initialHp) +
                '}';
    }
}
