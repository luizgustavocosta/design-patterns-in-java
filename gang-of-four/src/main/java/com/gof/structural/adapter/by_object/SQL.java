package com.gof.structural.adapter.by_object;

import java.util.List;

public interface SQL {

    boolean create(List<?> data);
    List<Object> retrieve(List<?> parameters);
    boolean update(List<?> parameters);
    boolean delete(List<?> parameters);
}
