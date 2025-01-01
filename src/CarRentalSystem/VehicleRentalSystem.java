package CarRentalSystem;

import java.util.List;

public class VehicleRentalSystem {
    List<Store> storeList;
    List<User>  usersList;

    public VehicleRentalSystem(List<Store> storeList, List<User> usersList) {
        this.storeList = storeList;
        this.usersList = usersList;
    }
    public List<Store> getStoreList() {
        return storeList;
    }
    public Store getStore(Location location) {
        for (Store store : storeList) {
            if (store.location.equals(location)) {
                return store;
            }
        }
       return null;
    }

}
