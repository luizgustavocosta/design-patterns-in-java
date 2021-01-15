package com.gof.structural.adapter.clazz;

import java.util.Collections;
import java.util.List;

public class Oracle implements SQL {

    @Override
    public boolean create(List<?> data) {
        return true;
    }

    @Override
    public List<Object> retrieve(List<?> parameters) {
        return Collections.emptyList();
    }

    @Override
    public boolean update(List<?> parameters) {
        return true;
    }

    @Override
    public boolean delete(List<?> parameters) {
        return true;
    }
}
