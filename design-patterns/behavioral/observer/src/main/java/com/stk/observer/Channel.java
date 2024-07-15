package com.stk.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    String name;
    List<Subscriber> subscribers = new ArrayList<>();

    public Channel(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subscriber sub){
        subscribers.add(sub);
    }

    @Override
    public void unsubscribe(Subscriber sub){
        subscribers.remove(sub);
    }

    @Override
    public void sendNotification(String title){
        for(Subscriber sub: subscribers){
            sub.update(title);
        }
    }

    @Override
    public void publishVideo(String title){
        sendNotification(title);
    }
}
