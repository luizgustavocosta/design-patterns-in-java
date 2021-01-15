package com.gof.structural.adapter.clazz;

import java.util.List;

public interface SQL {

    boolean create(List<?> data);
    List<Object> retrieve(List<?> parameters);
    boolean update(List<?> parameters);
    boolean delete(List<?> parameters);
}
