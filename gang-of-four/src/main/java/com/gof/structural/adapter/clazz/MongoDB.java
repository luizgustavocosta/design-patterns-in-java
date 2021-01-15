package com.gof.structural.adapter.clazz;

import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MongoDB implements NoSQL {

    private static final Logger logger = Logger.getLogger(MongoDB.class.getName());

    @Override
    public void insertOne(String document) {
        log("The document will be inserted, for sure");
    }

    @Override
    public List<String> find(String filter) {
        log(filter);
        return Collections.emptyList();
    }

    @Override
    public String deleteOne(String filter) {
        log(filter);
        log("Document deleted");
        return "deleted";
    }

    @Override
    public String findOneAndUpdate(String filter, String update) {
        log(filter);
        log(update);
        return "[{id:'42', description:'universe response'}]";
    }

    private void log(String parameter) {
        logger.log(Level.INFO, "Parameter -> {}", parameter);
    }
}
