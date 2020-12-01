package com.gof.creational.factory_method;

import java.util.EnumSet;
import java.util.Objects;

/**
 * The type My application aka ConcreteCreator
 * ConcreteCreator overrides the factory method to return an instance of a ConcreteProduct.
 */
public class MyApplication {

    public Document getDocument(CloudDocumentProvider provider) {
        Objects.requireNonNull(provider);
        switch (provider) {
            case GOOGLE:
                return new GoogleDoc();
            case APPLE:
                return new PagesDocument();
            case MICROSOFT:
                return new WordDocument();
            default:
                throw new IllegalArgumentException("The possible value are >>" + EnumSet.allOf(CloudDocumentProvider.class).toString());
        }
    }
}
