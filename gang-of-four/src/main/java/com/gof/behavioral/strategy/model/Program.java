package com.gof.behavioral.strategy.model;

import java.time.LocalDateTime;
import java.util.List;

public class Program {

    private LocalDateTime start;
    private LocalDateTime finish;
    private String description;
    private List<Category> category;

    public Program() {
        this(null, null, null, null);
    }

    public Program(LocalDateTime start, LocalDateTime finish, String description, List<Category> category) {
        this.start = start;
        this.finish = finish;
        this.description = description;
        this.category = category;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Program{" +
                "start=" + start +
                ", finish=" + finish +
                ", description='" + description + '\'' +
                ", category=" + category +
                '}';
    }

    public static final class ProgramGuideBuilder {
        private LocalDateTime start;
        private LocalDateTime finish;
        private String description;
        private List<Category> category;

        private ProgramGuideBuilder() {
        }

        public static ProgramGuideBuilder aProgramGuide() {
            return new ProgramGuideBuilder();
        }

        public ProgramGuideBuilder withStart(LocalDateTime start) {
            this.start = start;
            return this;
        }

        public ProgramGuideBuilder withFinish(LocalDateTime finish) {
            this.finish = finish;
            return this;
        }

        public ProgramGuideBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public ProgramGuideBuilder withCategory(List<Category> category) {
            this.category = category;
            return this;
        }

        public Program build() {
            return new Program(start, finish, description, category);
        }
    }
}
