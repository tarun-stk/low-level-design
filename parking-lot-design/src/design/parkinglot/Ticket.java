package design.parkinglot;

import java.time.LocalDateTime;

class Ticket {
    String ticketNumber;
    Vehicle vehicle;
    LocalDateTime entryTime;
    ParkingSpot spot;
}
