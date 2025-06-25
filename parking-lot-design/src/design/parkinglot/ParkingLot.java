package design.parkinglot;

class ParkingLot {
    static ParkingLot instance;
    String name;
    List<ParkingFloor> floors;

    static ParkingLot getInstance();

    ParkingSpot getFreeSpot(VehicleType type);
}
