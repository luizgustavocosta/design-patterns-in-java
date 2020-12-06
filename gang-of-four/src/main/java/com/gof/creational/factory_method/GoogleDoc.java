package com.gof.creational.factory_method;

import java.util.List;

/**
 * The type My document aka ConcreteProduct
 * ConcreteProduct implements the Product interface.
 */
public class GoogleDoc implements Document, TimeHandler {

    private DocumentAttributes documentAttributes;

    /**
     * Instantiates a new Google doc.
     */
    public GoogleDoc() {
        this.documentAttributes = DocumentAttributes.aBuilder()
                .withName("Untitled document")
                .withLastModified(nowInStringFormat())
                .build();
    }

    @Override
    public DocumentAttributes rename(String newName) {
        throw new UnsupportedOperationException("Unsupported");
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String share(List<String> users) {
        return "The document " + documentAttributes.getName() + " now is shared with you.";
    }
}
