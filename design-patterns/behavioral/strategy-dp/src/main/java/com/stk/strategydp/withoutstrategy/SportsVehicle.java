package com.stk.strategydp.withoutstrategy;

public class SportsVehicle extends Vehicle{
    /*Now in below we've same repitive code as of class OffRoadVehicle
    * so we're having same code at same level of inheritance (two subclasses at same level are having
    * duplicate code)
    * in this scenario we've to use strategy design pattern*/
    @Override
    void drive(){
        System.out.println("Special drive strategy");
    }
}
