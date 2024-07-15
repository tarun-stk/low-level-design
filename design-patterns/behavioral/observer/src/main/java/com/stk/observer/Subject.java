package com.stk.observer;

public interface Subject {
    void subscribe(Subscriber sub);

    void unsubscribe(Subscriber sub);

    void sendNotification(String title);

    void publishVideo(String title);
}
