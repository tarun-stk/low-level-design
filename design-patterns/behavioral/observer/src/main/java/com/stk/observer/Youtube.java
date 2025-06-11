package com.stk.observer;

/*The Observer Design Pattern is a behavioral design pattern that defines a one-to-many relationship
between objects, allowing one object (the subject) to notify multiple other objects (the observers)
of any state changes. This pattern is often used to implement distributed event-handling systems.

Key Components:
Subject: The object that holds the state and sends notifications to observers.
Observer: The objects that need to be notified of state changes in the subject.

When to Use the Observer Pattern:
When an object’s state change needs to be communicated to multiple other objects.
When the number of observers can change dynamically.
When you want to decouple the subject and observers, making them independent of each other.

Advantages of Observer Pattern:
Decoupling: Subjects and observers are loosely coupled, allowing changes to either without affecting the other.
Flexibility: Observers can be added or removed at runtime, allowing dynamic changes to the system behavior.
Reusability: Observers can be reused across different subjects.

Disadvantages of Observer Pattern:
Performance Overhead: Notifying many observers can be time-consuming, potentially leading to performance issues.
Complexity: Managing dependencies and ensuring consistent state across observers can be complex.*/
public class Youtube {
    public static void main(String[] args) {
        /*tata a channel(subject) and it will send notification to all its subscribers*/
        Channel tata = new Channel("Tata");
        /*Susbcribers(observers) are observers observing to tata channel;*/
        Subscriber s1 = new Subscriber("Vishal");
        Subscriber s2 = new Subscriber("Varun");
        Subscriber s3 = new Subscriber("Vishwa");

        /*subscribers subscribing to channel tata*/
        tata.subscribe(s1);
        tata.subscribe(s2);
        tata.subscribe(s3);
        s1.channel = tata;
        s2.channel = tata;
        s3.channel = tata;

        /*channel publishing a new video, which will notify all the subscribers */
        tata.publishVideo("Tiago");
    }
}
