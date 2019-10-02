package com.gof.behavioral.strategy.model;

import java.util.List;

public class TVChannel {

    private String name;
    private List<Program> programGuide;
    private List<Category> categories;

    public TVChannel() {
        this(null, null, null);
    }

    public TVChannel(String name, List<Program> programGuide, List<Category> categories) {
        this.name = name;
        this.programGuide = programGuide;
        this.categories = categories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProgramGuide(List<Program> programGuide) {
        this.programGuide = programGuide;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public List<Program> getProgramGuide() {
        return programGuide;
    }

    public List<Category> getCategories() {
        return categories;
    }

    @Override
    public String toString() {
        return "TVChannel{" +
                "name='" + name + '\'' +
                ", programGuide=" + programGuide +
                ", categories=" + categories +
                '}';
    }

    public static final class ChannelBuilder {
        private String name;
        private List<Program> programGuide;
        private List<Category> categories;

        private ChannelBuilder() {
        }

        public static ChannelBuilder aChannel() {
            return new ChannelBuilder();
        }

        public ChannelBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ChannelBuilder withProgramGuide(List<Program> programGuide) {
            this.programGuide = programGuide;
            return this;
        }

        public ChannelBuilder withCategories(List<Category> categories) {
            this.categories = categories;
            return this;
        }

        public TVChannel build() {
            return new TVChannel(name, programGuide, categories);
        }
    }
}
