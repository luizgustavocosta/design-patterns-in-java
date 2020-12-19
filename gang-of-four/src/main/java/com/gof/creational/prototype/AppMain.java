package com.gof.creational.prototype;

import java.util.Arrays;
import java.util.List;

/**
 * Represents the client
 */
public class AppMain {

    public static void main(String[] args) {

        List<GitObject> gitObjects = Arrays.asList(
                createGitObject("Ada", "Hello World"),
                createGitObject("Dijkstra", "Walking..."),
                createGitObject("Linus", "Do it right")
        );
        List<References> references = Arrays.asList(
                new References("origin/master"),
                new References("tags/0.0.1"),
                new References("tags/0.0.2"),
                new References("development"));

        Repository myRepository = new Repository("Luiz Costa", "Design Patterns", "Design Patterns using Java",
                Visibility.PUBLIC, gitObjects, references);

        final Repository mySameRepository = myRepository.prototype();

        System.out.println(myRepository);
        System.out.println(mySameRepository);

        System.out.println(myRepository.equals(mySameRepository));

    }

    private static GitObject createGitObject(String author, String comment) {
        final GitObject gitObject = new GitObject();
        gitObject.addCommit(Commit.CommitBuilder.aCommit()
                .withAuthor(author)
                .withComment(comment)
                .build());

        return gitObject;

    }
}
