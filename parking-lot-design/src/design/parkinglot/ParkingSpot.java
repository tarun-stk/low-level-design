package design.parkinglot;

abstract class ParkingSpot {
    String number;
    boolean isFree;
    Vehicle vehicle;

    abstract void assignVehicle(Vehicle v);
    abstract void removeVehicle();
}