package com.gof.structural.adapter.clazz;

import java.util.List;

public class DatabaseAdapterTwoWaysSQLNoSQL implements SQL, NoSQL {

    private DatabaseAdapterTwoWaysSQLNoSQL(){}

    private static SQL sql;
    private static NoSQL noSQL;

    public static SQL ofSQL() {
        sql = new Oracle();
        return sql;
    }

    public static NoSQL ofNoSQL() {
        noSQL = new MongoDB();
        return noSQL;
    }


    @Override
    public void insertOne(String document) {
        noSQL.insertOne(document);
    }

    @Override
    public List<String> find(String filter) {
        return noSQL.find(filter);
    }

    @Override
    public String deleteOne(String filter) {
        return noSQL.deleteOne(filter);
    }

    @Override
    public String findOneAndUpdate(String filter, String update) {
        return noSQL.findOneAndUpdate(filter, update);
    }

    @Override
    public boolean create(List<?> data) {
        return sql.create(data);
    }

    @Override
    public List<Object> retrieve(List<?> parameters) {
        return sql.retrieve(parameters);
    }

    @Override
    public boolean update(List<?> parameters) {
        return sql.update(parameters);
    }

    @Override
    public boolean delete(List<?> parameters) {
        return sql.delete(parameters);
    }
}
