package com.gof.behavioral.strategy.client;

import com.gof.behavioral.strategy.model.TVChannel;
import com.gof.behavioral.strategy.printer.PrinterStrategy;

/**
 * The type Rest api.
 */
public class RestApi implements Context {

    private PrinterStrategy printerStrategy;

    // Add other methods, if any

    @Override
    public void defineStrategy(PrinterStrategy strategy) {
        this.printerStrategy = strategy;
    }

    @Override
    public String print(TVChannel tvChannel) {
        return printerStrategy.print(tvChannel);
    }
}
