package com.gof.creational.prototype;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Represents the ConcretePrototype
 */
public class Repository implements ConfigurationSettings, Prototype {

    private final String id;
    private final String owner;
    private final String name;
    private final String description;
    private final Visibility visibility;
    private final List<GitObject> gitObjects;
    private final List<References> references;

    public Repository(String owner,
                      String name,
                      String description,
                      Visibility visibility,
                      List<GitObject> gitObjects,
                      List<References> references) {
        this.id = UUID.randomUUID().toString();
        this.owner = owner;
        this.name = name;
        this.description = description;
        this.visibility = visibility;
        this.references = references;
        this.gitObjects = gitObjects;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public List<GitObject> getGitObjects() {
        return List.copyOf(gitObjects);
    }

    public List<References> getReferences() {
        return List.copyOf(references);
    }

    public String getId() {
        return id;
    }

    @Override
    public String getOwner() {
        return owner;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String description() {
        return description;
    }

    @Override
    public Visibility visibility() {
        return visibility;
    }

    @Override
    public Repository prototype() {
        try {
            return (Repository) super.clone();
        } catch (CloneNotSupportedException exception) {
            throw new UnsupportedOperationException("The prototype operation failed.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repository that = (Repository) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(owner, that.owner) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                visibility == that.visibility &&
                Objects.equals(gitObjects, that.gitObjects) &&
                Objects.equals(references, that.references);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, owner, name, description, visibility, gitObjects, references);
    }

    @Override
    public String toString() {
        return "Repository{" +
                "id='" + id + '\'' +
                ", owner='" + owner + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", visibility=" + visibility +
                ", gitObjects=" + gitObjects +
                ", references=" + references +
                '}';
    }
}
