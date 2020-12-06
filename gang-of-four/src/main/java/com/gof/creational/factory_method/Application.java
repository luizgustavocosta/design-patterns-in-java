package com.gof.creational.factory_method;

/**
 * The type Application aka Creator.
 * Creator declares the factory method, which returns an object of type Product.
 * Creator may also define a default implementation of the factory method that returns a default ConcreteProduct object.
 * may call the factory method to create a Product object.
 */
public abstract class Application {

    /**
     * Factory method document.
     *
     * @param provider the provider
     * @return the document
     */
    public Document factoryMethod(CloudDocumentProvider provider) {
        return new GoogleDoc();
    }

}
