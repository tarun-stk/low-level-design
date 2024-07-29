package com.stk.abstractfactorydp;

public class MacFactory implements InterfaceFactory{
    @Override
    public void createButton() {
        System.out.println("Created mac button!!");
    }

    @Override
    public void createTextBox() {
        System.out.println("Created mac text box!!");
    }
}
