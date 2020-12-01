package com.gof.creational.factory_method;

import java.util.List;

/**
 * The type Document, aka Product
 * Product defines the interface of objects the factory method creates.
 */
public interface Document {

    DocumentAttributes rename(String newName);

    void delete();

    String share(List<String> users);
}
