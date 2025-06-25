package design.parkinglot;

import java.time.LocalDateTime;

enum PaymentMode { CASH, CARD, UPI }

class Payment {
    double amount;
    LocalDateTime timestamp;
    PaymentMode mode;
}

