package com.os.factorydp;

public class MainClass {
    public static void main(String[] args) {
        /*This is not good practice, as we're directly creating an object
        * client can see which we're actually using, also if in future you want to
        * change below to some thing else, you've to manually do it
        * We need someone who can do this for us, we're only concerned about using
        * Android, and we don't care who implements it, in that scenario we can use
        * factory design pattern(creational dp)*/
        OS android = new Android();
        android.specifications();

        /*Using factory dp
        * Now we can simply pass whatever os we need, and we're not manually creating any objects
        * simply pass which kind of os you need and someone will give it to you
        * someone is called factory, this is good practice*/
        /*I just need an android phone, i don't who is implementing it maybe samsung, moto anythign
        * I just android phone and factory will give it to me*/
        OSFactory factory = new OSFactory();
        OS os = factory.getInstance("android");
        os.specifications();
    }
}
