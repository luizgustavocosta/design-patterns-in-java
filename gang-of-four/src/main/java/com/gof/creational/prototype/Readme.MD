## Prototype

## When to use?
Use this pattern when creating an instance of given a class is either expensive or complicated.[1]

## Advantages
Hides the complexities of making new instances

Provides an option for the client to generate objects whose type is unknown.[1]

## Drawback
Sometimes make the copy could be complicated.[1]

### Model

#### References
https://learning.oreilly.com/library/view/version-control-with/9781449345037/ch04.html

REPOSITORIES
A Git repository is simply a database containing all the information needed to retain and manage the revisions and history of a project. In Git, as with most version control systems, a repository retains a complete copy of the entire project throughout its lifetime. However, unlike most other VCSs, the Git repository not only provides a complete working copy of all the files in the repository, but also a copy of the repository itself with which to work.

Git maintains a set of configuration values within each repository. You saw some of these, such as the repository user’s name and email address, in the previous chapter. Unlike file data and other repository metadata, configuration settings are not propagated from one repository to another during a clone, or duplicating, operation. Instead, Git manages and inspects configuration and setup information on a per-site, per-user, and per-repository basis.

Within a repository, Git maintains two primary data structures, the object store and the index. All of this repository data is stored at the root of your working directory in a hidden subdirectory named .git.

The object store is designed to be efficiently copied during a clone operation as part of the mechanism that supports a fully distributed VCS. The index is transitory information, is private to a repository, and can be created or modified on demand as needed.

The next two sections describe the object store and index in more detail.

GIT OBJECT TYPES
At the heart of Git’s repository implementation is the object store. It contains your original data files and all the log messages, author information, dates, and other information required to rebuild any version or branch of the project.

Git places only four types of objects in the object store: the blobs, trees, commits, and tags. These four atomic objects form the foundation of Git’s higher level data structures.


Git clone
The git clone command creates a new Git repository based on the original you specify via a filesystem or network address. Git doesn’t have to copy all the information in the original to the clone. Instead, Git ignores information that is pertinent only to the original repository, such as remote-tracking branches.

Git objects
https://git-scm.com/book/en/v2/Git-Internals-Git-Objects

Model example
https://astahblog.com/2015/09/08/git-data-model/