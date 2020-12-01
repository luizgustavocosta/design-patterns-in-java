package com.gof.creational.factory_method;

import java.util.List;

public class WordDocument implements Document, TimeHandler {

    DocumentAttributes documentAttributes;

    public WordDocument() {
        this.documentAttributes = DocumentAttributes.aBuilder()
                .withName("Untitled document")
                .withLastModified(nowInStringFormat())
                .build();
    }

    @Override
    public DocumentAttributes rename(String newName) {
        return DocumentAttributes.aBuilder()
                .withName(newName)
                .withLastModified(nowInStringFormat())
                .withSize(documentAttributes.getSize() + 1)
                .build();
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String share(List<String> users) {
        return "Hello Wor(l)d, now you're able to contribute on the document >> " + documentAttributes.getName();
    }
}
