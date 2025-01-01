package CarRentalSystem;

import CarRentalSystem.Product.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //create a users
        List<User> users = addUsers();
        //create store
        List<Store> stores = addStores();

        VehicleRentalSystem vrs = new VehicleRentalSystem(stores, users);

        // User comes
        User user = users.getFirst();
        Location loc = new Location("","","state","1212");
        Store store = vrs.getStore(loc);

        List<Vehicle> storeVehicles = store.getVehicles();

        Reservation reservation = new Reservation(storeVehicles.getFirst(),user);

        Bill bill = new Bill(reservation);

        Payment payment = new Payment();
        payment.payBill(bill);

        store.completeReservation(reservation.reservationID);






    }
    public static List<User> addUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User(1,"Anupam","XXX");
        users.add(user1);
        return users;
    }
    public static List<Store> addStores() {
        List<Store> stores = new ArrayList<>();
        Store store1 = new Store(1,"RoyalBrothersHSR");
        stores.add(store1);
        return stores;
    }
}
