package com.gof.creational.prototype;

import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class RepositoryTest implements WithAssertions {

    private static GitObject createFakeGitObject(String author, String comment) {
        final GitObject gitObject = new GitObject();
        gitObject.addCommit(Commit.CommitBuilder.aCommit()
                .withAuthor(author)
                .withComment(comment)
                .build());

        return gitObject;

    }

    @DisplayName("Prototype of Repository")
    @Test
    void whenAPrototypeIsRequestThenClone() {

        List<GitObject> gitObjects = Arrays.asList(
                createFakeGitObject("Ada", "Hello World"),
                createFakeGitObject("Dijkstra", "Walking..."),
                createFakeGitObject("Linus", "Do it right")
        );
        List<References> references = Arrays.asList(
                new References("origin/master"),
                new References("tags/0.0.1"),
                new References("tags/0.0.2"),
                new References("development"));


        final Repository repository = new Repository("Luiz Costa", "Design Patterns", "Design Patterns using Java",
                Visibility.PRIVATE, gitObjects, references);

        final Repository myPrototype = repository.prototype();

        assertThat(repository).as("The objects should be equals").isEqualToComparingFieldByFieldRecursively(myPrototype);

    }

}