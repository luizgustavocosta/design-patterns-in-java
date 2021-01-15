package com.gof.structural.adapter.by_object;

import java.util.List;

public class DatabaseAdapterTwoWaysSQLNoSQL implements SQL, NoSQL {


    @Override
    public void insertOne(String document) {

    }

    @Override
    public List<String> find(String filter) {
        return null;
    }

    @Override
    public String deleteOne(String filter) {
        return null;
    }

    @Override
    public String findOneAndUpdate(String filter, String update) {
        return null;
    }

    @Override
    public boolean create(List<?> data) {
        return false;
    }

    @Override
    public List<Object> retrieve(List<?> parameters) {
        return null;
    }

    @Override
    public boolean update(List<?> parameters) {
        return false;
    }

    @Override
    public boolean delete(List<?> parameters) {
        return false;
    }
}
