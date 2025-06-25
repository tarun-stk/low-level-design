package design.parkinglot;

import java.util.List;
import java.util.Map;

abstract class ParkingFloor {
    int floorNumber;
    Map<VehicleType, List<ParkingSpot>> spotMap;

    abstract ParkingSpot getFreeSpot(VehicleType type);
}
