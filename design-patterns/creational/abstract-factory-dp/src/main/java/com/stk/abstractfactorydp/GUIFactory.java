package com.stk.abstractfactorydp;

public class GUIFactory {
    static InterfaceFactory getFactory(String input){
        if(input.equals("mac")){
            return new MacFactory();
        }
        else if(input.equals("win")){
            return new WinFactory();
        }
        return null;
    }

}
