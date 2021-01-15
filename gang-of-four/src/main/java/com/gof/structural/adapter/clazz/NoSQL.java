package com.gof.structural.adapter.clazz;

import java.util.List;

public interface NoSQL {

    void insertOne(String document);
    List<String> find(String filter);
    String deleteOne(String filter);
    String findOneAndUpdate(String filter, String update);
}
