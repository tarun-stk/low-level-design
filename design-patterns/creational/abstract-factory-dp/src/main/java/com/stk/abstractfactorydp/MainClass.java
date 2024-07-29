package com.stk.abstractfactorydp;

public class MainClass {
    public static void main(String[] args) {
        /*Client passing win as his os and he will get win functionality*/
        /*Getting factory from factory*/
        InterfaceFactory iFactory = GUIFactory.getFactory("win");
        iFactory.createButton();
    }
}

/*Abstract factory dp is factory design pattern which will give you factory
* and factory will intern give you object*/
