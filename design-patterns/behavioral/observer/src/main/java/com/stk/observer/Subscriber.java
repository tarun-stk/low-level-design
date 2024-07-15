package com.stk.observer;



public class Subscriber implements Observer {
    String name;
    Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String title){
        System.out.println(name + " " + " a new video has been uploaded!" + title);
    }
}
