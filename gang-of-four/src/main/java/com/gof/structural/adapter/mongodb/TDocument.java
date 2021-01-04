package com.gof.structural.adapter.mongodb;

public class TDocument {

    private final String content;

    public TDocument(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "TDocument{" +
                "content='" + content + '\'' +
                '}';
    }
}
