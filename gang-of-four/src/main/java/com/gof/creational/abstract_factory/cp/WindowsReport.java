package com.gof.creational.abstract_factory.cp;

import com.gof.creational.abstract_factory.ap.OperationalSystem;
import com.gof.creational.abstract_factory.ap.Report;

public class WindowsReport implements Report {

    private final OperationalSystem operationalSystem;

    public WindowsReport(OperationalSystem operationalSystem) {
        this.operationalSystem = operationalSystem;
    }

    @Override
    public String print() {
        return operationalSystem.releaseNotes();
    }
}
