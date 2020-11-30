package com.gof.creational.factory_method;

/**
 * The type My application aka ConcreteCreator
 * ConcreteCreator overrides the factory method to return an instance of a ConcreteProduct.
 */
public class MyApplication {

    public Document getDocument(CloudDocumentProvider provider) {
        switch (provider) {
            case GOOGLE:
                return new GoogleDoc();
            case APPLE:
                return new PagesDocument();
            case MICROSOFT:
                return new WordDocument();
            default:
                new NotepadDocument();
        }
        throw new IllegalStateException("Impossible create a new document");
    }
}
