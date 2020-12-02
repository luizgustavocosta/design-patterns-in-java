package com.gof.creational.factory_method;

/**
 * The type App main.
 */
public class AppMain {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        MyApplication myApplication = new MyApplication();
        final Document document = myApplication.factoryMethod(CloudDocumentProvider.GOOGLE);
        System.out.println(document);
    }
}
