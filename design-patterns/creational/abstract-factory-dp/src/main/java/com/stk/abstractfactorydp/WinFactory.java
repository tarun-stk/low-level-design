package com.stk.abstractfactorydp;

public class WinFactory implements InterfaceFactory{
    @Override
    public void createButton() {
        System.out.println("Created windows button!!");
    }

    @Override
    public void createTextBox() {
        System.out.println("Created windows text box!!");
    }
}
