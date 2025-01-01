package CarRentalSystem;

import CarRentalSystem.Product.Vehicle;

import java.util.List;

public class Store {
    int storeID;
    String storeName;
    Location location;
    VehicleInventoryManager vehicleInventoryManager;
    List<Reservation> reservations;
    public Store(int storeID, String storeName){
        this.storeID = storeID;
        this.storeName = storeName;
    }
    public void setVehicles(List<Vehicle> vehicles){
        vehicleInventoryManager = new VehicleInventoryManager(vehicles);
    }
    public List<Vehicle> getVehicles(){
        return vehicleInventoryManager.getVehicles();
    }
    public void completeReservation(int reservationID) {

        //take out the reservation from the list and call complete the reservation method.
    }
}
