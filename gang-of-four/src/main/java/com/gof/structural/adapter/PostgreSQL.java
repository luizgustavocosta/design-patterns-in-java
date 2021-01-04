package com.gof.structural.adapter;

import java.util.List;

public interface PostgreSQL extends SQL {

    boolean create(List<?> data);
    List<Object> retrieve(List<?> parameters);
    boolean update(List<?> parameters);
    boolean delete(List<?> parameters);
}
