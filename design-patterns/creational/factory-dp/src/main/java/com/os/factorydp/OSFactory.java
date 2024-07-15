package com.os.factorydp;

public class OSFactory {
    public OS getInstance(String input){
        if(input.equals("android")){
            return new Android();
        }
        else if(input.equals("ios")){
            return new IOS();
        }
        else{
            return new Windows();
        }
    }

}
