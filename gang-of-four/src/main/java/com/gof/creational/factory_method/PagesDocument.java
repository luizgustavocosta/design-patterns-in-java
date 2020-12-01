package com.gof.creational.factory_method;

import org.apache.logging.log4j.util.Strings;

import java.util.List;

/**
 * The type Pages document.
 */
public class PagesDocument implements Document, TimeHandler {

    private final DocumentAttributes documentAttributes;

    /**
     * Instantiates a new Pages document.
     */
    public PagesDocument() {
        this.documentAttributes = DocumentAttributes.aBuilder()
                .withName("untitled.pages")
                .withLastModified(nowInStringFormat())
                .build();
    }

    @Override
    public DocumentAttributes rename(String newName) {
        return DocumentAttributes.aBuilder()
                .withName(newName)
                .withLastModified(nowInStringFormat())
                .withSize(documentAttributes.getSize() + 2)
                .build();
    }

    @Override
    public void delete() {
        throw new IllegalStateException("Documents in this format are not deletable");
    }

    @Override
    public String share(List<String> users) {
        return Strings.EMPTY;
    }
}
