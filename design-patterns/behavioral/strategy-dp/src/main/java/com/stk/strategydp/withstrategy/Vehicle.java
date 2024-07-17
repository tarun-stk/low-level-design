package com.stk.strategydp.withstrategy;

public class Vehicle {
    /*Now vehicle has a drive strategy*/
    DriveStrategy driveStrategy;
    /*each vehicle will pass what kind of strategy it wants*/
    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    void drive(){
        driveStrategy.drive();
    }

}
