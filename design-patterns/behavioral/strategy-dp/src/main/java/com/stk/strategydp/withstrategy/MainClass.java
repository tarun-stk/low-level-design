package com.stk.strategydp.withstrategy;

public class MainClass {
    public static void main(String[] args) {
//        Vehicle vehicle = new GoodsVehicle();
        Vehicle vehicle = new OffRoadVehicle();
        vehicle.drive();
    }
}

            /*              DriveStrategy
            *               /         \
            *         specialdrive     normaldrive
            *           /  \                /
                 offroad  sportscar        goodsvehicle*/
