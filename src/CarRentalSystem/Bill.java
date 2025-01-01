package CarRentalSystem;

public class Bill {
    int billID;
    boolean isPaid;
    int amount;
    Reservation reservation;
    public Bill(Reservation reservation) {
        this.reservation = reservation;
    }
}
