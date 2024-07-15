package com.example.builderdp;

public class MainClass {
    public static void main(String[] args) {
        /*Problems of using below, we must remember the sequence of input params
        * no.of params,
        * and in situations where we don't care about some features, and only about few,
        * by using below we cannot do that, because compiler will force you to give some value
        * for that field*/
        Phone phone = new Phone("samsung", 8, 50, 128, "F1");

        /*Builder dp addresses above problems, it allows us to give only what we need
        * and it will build an object for us
        * By doing below, we don't care about how the final product would be we only care
        * about name is samsung and camera has 100mp, and we willget the object by deafult
        * by doing this we're avoiding boilerplate code, also not assigning unnecessary things.*/
        Phone p1 = new PhoneBuilder().setName("samsung").setCamera(100).build();
    }
}
