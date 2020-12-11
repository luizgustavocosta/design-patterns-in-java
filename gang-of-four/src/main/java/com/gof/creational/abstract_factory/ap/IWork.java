package com.gof.creational.abstract_factory.ap;

import com.gof.creational.abstract_factory.license.License;
import com.gof.creational.abstract_factory.license.Proprietary;

public interface IWork extends OfficeSuite {

    default License getLicense() {
        return new Proprietary();
    }
}
