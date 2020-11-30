package com.gof.creational.factory_method;

import java.util.List;

/**
 * The type Document, aka Product
 * Product defines the interface of objects the factory method creates.
 */
public interface Document {

    void rename(String newName);

    void delete();

    void share(List<String> users);
}
