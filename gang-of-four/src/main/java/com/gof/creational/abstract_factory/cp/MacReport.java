package com.gof.creational.abstract_factory.cp;

import com.gof.creational.abstract_factory.ap.OperationalSystem;
import com.gof.creational.abstract_factory.ap.Report;

public class MacReport implements Report {

    private final OperationalSystem operationalSystem;

    public MacReport(OperationalSystem operationalSystem) {
        this.operationalSystem = operationalSystem;
    }

    @Override
    public String print() {
        return operationalSystem.releaseNotes();
    }
}
