package CarRentalSystem;

import CarRentalSystem.Product.Vehicle;

import java.util.Date;

public class Reservation {
    int reservationID;
    Store store;
    User user;
    Vehicle vehicle;
    Date dateBooked;
    Date bookedFrom;
    Date bookedTo;
    public Reservation(Vehicle vehicle, User user)  {
        this.vehicle = vehicle;
        this.user = user;
    }
}
