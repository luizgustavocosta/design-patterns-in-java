package com.gof.creational.factory_method;

import java.util.List;

/**
 * The type Document, aka Product
 * Product defines the interface of objects the factory method creates.
 */
public interface Document {

    /**
     * Rename document attributes.
     *
     * @param newName the new name
     * @return the document attributes
     */
    DocumentAttributes rename(String newName);

    /**
     * Delete.
     */
    void delete();

    /**
     * Share string.
     *
     * @param users the users
     * @return the string
     */
    String share(List<String> users);
}
