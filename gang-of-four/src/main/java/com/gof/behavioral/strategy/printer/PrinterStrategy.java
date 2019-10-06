package com.gof.behavioral.strategy.printer;

import com.gof.behavioral.strategy.model.TVChannel;
import com.google.gson.Gson;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.zip.GZIPOutputStream;

import static java.util.Objects.isNull;

/**
 * The interface Printer strategy.
 */
@FunctionalInterface
public interface PrinterStrategy {

    /**
     * Print string.
     *
     * @param tvChannel the tv channel
     * @return the string
     */
    String print(TVChannel tvChannel);

    /**
     * Normal strategy printer strategy.
     *
     * @return the printer strategy
     */
    static PrinterStrategy normalStrategy() {
        return String::valueOf;
    }

    /**
     * To json printer strategy.
     *
     * @return the printer strategy
     */
    static PrinterStrategy toJson()  {
        return tvChannel -> new Gson().toJson(tvChannel);
    }

    /**
     * To xml printer strategy.
     *
     * @return the printer strategy
     */
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

    /**
     * To g gzip format printer strategy.
     *
     * @return the printer strategy
     */
    static PrinterStrategy toGzip() {
        return tvChannel ->  gzip(tvChannel.toString());
    }

    /**
     * Zip string.
     *
     * @param tvChannel the tv channel
     * @return the string
     */
    static String gzip(final String tvChannel) {
        if (isNull(tvChannel)) {
            throw new IllegalArgumentException("TVChannel cannot be null");
        }
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            try (GZIPOutputStream gzipOutputStream = new GZIPOutputStream(byteArrayOutputStream)) {
                gzipOutputStream.write(tvChannel.getBytes(StandardCharsets.UTF_8));
            }
            return byteArrayOutputStream.toString();
        } catch(IOException exception) {
            throw new IllegalStateException(exception);
        }
    }

}
