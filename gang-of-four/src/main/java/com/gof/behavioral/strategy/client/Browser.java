package com.gof.behavioral.strategy.client;

import com.gof.behavioral.strategy.model.TVChannel;
import com.gof.behavioral.strategy.printer.PrinterStrategy;

/**
 * The type Browser.
 */
public class Browser implements Context {

    private PrinterStrategy printerStrategy;


    @Override
    public void defineStrategy(PrinterStrategy strategy) {
        this.printerStrategy = strategy;
    }

    @Override
    public String print(TVChannel tvChannel) {
        return printerStrategy.print(tvChannel);
    }
}
