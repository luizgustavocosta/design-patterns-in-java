package com.gof.behavioral.strategy.printer;

import com.gof.behavioral.strategy.model.TVChannel;
import com.google.gson.Gson;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.StringWriter;

@FunctionalInterface
public interface PrinterStrategy {

    String print(TVChannel tvChannel);

    static PrinterStrategy normalStrategy() {
        return String::valueOf;
    }

    static PrinterStrategy toJson()  {
        return tvChannel -> new Gson().toJson(tvChannel);
    }

    static PrinterStrategy toXML()  {
        return tvChannel -> {
            try {
                StringWriter stringWriter = new StringWriter();

                JAXBContext jaxbContext = JAXBContext.newInstance(TVChannel.class);
                Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

                jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
                        true);

                QName qName = new QName("behavioral.strategy", "tvchannel");
                JAXBElement<TVChannel> root = new JAXBElement<>(qName, TVChannel.class, tvChannel);

                jaxbMarshaller.marshal(root, stringWriter);

                return stringWriter.toString();

            } catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        };
    }

    static PrinterStrategy toStringFormat() {
        return Object::toString;
    }

}
