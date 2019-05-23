defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. It is also referred to as the publish-subscribe pattern.

In observer pattern, there are many observers (subscriber objects) that are observing a particular subject (publisher object). Observers register themselves to a subject to get a notification when there is a change made inside that subject.

A observer object can register or unregister from subject at any point of time. It helps is making the objects objects loosely coupled.
![UML Diagram](https://en.wikipedia.org/wiki/Observer_pattern#/media/File:W3sDesign_Observer_Design_Pattern_UML.jpg)

