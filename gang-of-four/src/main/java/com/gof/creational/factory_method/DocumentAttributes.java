package com.gof.creational.factory_method;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Objects;

class DocumentAttributes {

    private final String name;
    private final String lastModified;
    private final long size;

    protected DocumentAttributes(String name, String lastModified, long size) {
        Objects.requireNonNull(name);
        Objects.requireNonNull(size);
        this.name = name;
        this.lastModified = lastModified == null ? ZonedDateTime.now(ZoneId.of("UTC")).toString() : lastModified;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getLastModified() {
        return lastModified;
    }

    public long getSize() {
        return size;
    }

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

    public static final class DocumentAttributesBuilder {
        private String name;
        private String lastModified;
        private long size;

        private DocumentAttributesBuilder() {
        }

        public static DocumentAttributesBuilder aDocumentAttributes() {
            return new DocumentAttributesBuilder();
        }

        public DocumentAttributesBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public DocumentAttributesBuilder withLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        public DocumentAttributesBuilder withSize(long size) {
            this.size = size;
            return this;
        }

        public DocumentAttributes build() {
            return new DocumentAttributes(name, lastModified, size);
        }
    }
}
