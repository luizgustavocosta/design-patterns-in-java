package com.gof.creational.prototype;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/**
 * Represents the ConcretePrototype
 */
public class GitObject implements Prototype {

    private final String id;
    private final Set<Commit> commits = new HashSet<>();

    public GitObject() {
        this.id = UUID.randomUUID().toString();
    }

    void addCommit(Commit commit) {
        commits.add(commit);
    }

    public String getId() {
        return id;
    }

    public Set<Commit> getCommits() {
        return commits;
    }

    @Override
    public GitObject prototype() {
        try {
            return (GitObject) this.clone();
        } catch (CloneNotSupportedException e) {
            throw new UnsupportedOperationException("Prototype not supported.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GitObject gitObject = (GitObject) o;
        return Objects.equals(id, gitObject.id) &&
                Objects.equals(commits, gitObject.commits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commits);
    }

    @Override
    public String toString() {
        return "GitObject{" +
                "id='" + id + '\'' +
                ", commits=" + commits +
                '}';
    }
}
