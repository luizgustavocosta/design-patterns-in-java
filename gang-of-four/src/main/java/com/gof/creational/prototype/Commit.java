package com.gof.creational.prototype;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Commit {

    private final ZonedDateTime commitDate;
    private final String author;
    private final String comment;

    public Commit(String author, String comment) {
        this.author = author;
        this.comment = comment;
        this.commitDate = ZonedDateTime.now(ZoneId.of("GMT"));
    }

    public ZonedDateTime getCommitDate() {
        return commitDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getComment() {
        return comment;
    }

    @Override
    public String toString() {
        return "Commit{" +
                "commitDate=" + commitDate +
                ", author='" + author + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }

    public static final class CommitBuilder {
        private String author;
        private String comment;

        private CommitBuilder() {
        }

        public static CommitBuilder aCommit() {
            return new CommitBuilder();
        }


        public CommitBuilder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public CommitBuilder withComment(String comment) {
            this.comment = comment;
            return this;
        }

        public Commit build() {
            return new Commit(this.author, this.comment);
        }
    }
}
