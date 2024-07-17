package com.stk.strategydp.withstrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle(){
        super(new SpecialDriveStrategy());
    }
}
