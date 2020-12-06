package com.gof.creational.factory_method;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * The type Document attributes.
 */
class DocumentAttributes {

    private final String name;
    private final String lastModified;
    private final long size;

    /**
     * Instantiates a new Document attributes.
     *
     * @param name         the name
     * @param lastModified the last modified
     * @param size         the size
     */
    protected DocumentAttributes(String name, String lastModified, long size) {
        Objects.requireNonNull(name);
        this.name = name;
        this.lastModified = lastModified == null ? ZonedDateTime.now(ZoneId.of("UTC")).toString() : lastModified;
        this.size = size;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets last modified.
     *
     * @return the last modified
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public long getSize() {
        return size;
    }

    /**
     * A builder document attributes builder.
     *
     * @return the document attributes builder
     */
    public static DocumentAttributesBuilder aBuilder() {
        return new DocumentAttributesBuilder();
    }

    @Override
    public String toString() {
        return "DocumentAttributes{" +
                "name='" + name + '\'' +
                ", lastModified='" + lastModified + '\'' +
                ", size=" + size +
                '}';
    }

    /**
     * The type Document attributes builder.
     */
    public static final class DocumentAttributesBuilder {
        private String name;
        private String lastModified;
        private long size;

        private DocumentAttributesBuilder() {
        }

        /**
         * A document attributes document attributes builder.
         *
         * @return the document attributes builder
         */
        public static DocumentAttributesBuilder aDocumentAttributes() {
            return new DocumentAttributesBuilder();
        }

        /**
         * With name document attributes builder.
         *
         * @param name the name
         * @return the document attributes builder
         */
        public DocumentAttributesBuilder withName(String name) {
            this.name = name;
            return this;
        }

        /**
         * With last modified document attributes builder.
         *
         * @param lastModified the last modified
         * @return the document attributes builder
         */
        public DocumentAttributesBuilder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * With size document attributes builder.
         *
         * @param size the size
         * @return the document attributes builder
         */
        public DocumentAttributesBuilder withSize(long size) {
            this.size = size;
            return this;
        }

        /**
         * Build document attributes.
         *
         * @return the document attributes
         */
        public DocumentAttributes build() {
            return new DocumentAttributes(name, lastModified, size);
        }
    }
}
