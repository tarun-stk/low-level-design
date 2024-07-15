package com.stk.observer;

public class Youtube {
    public static void main(String[] args) {
        /*tata a channel(subject) and it will send notification to all its subscribers*/
        Channel tata = new Channel("Tata");
        /*Susbcribers(observers) are observers observing to tata channel;*/
        Subscriber s1 = new Subscriber("Vishal");
        Subscriber s2 = new Subscriber("Varun");
        Subscriber s3 = new Subscriber("Vishwa");

        tata.subscribers.add(s1);
        tata.subscribers.add(s2);
        tata.subscribers.add(s3);

        s1.channel = tata;
        s2.channel = tata;
        s3.channel = tata;

        tata.publishVideo("Tiago");
    }
}
