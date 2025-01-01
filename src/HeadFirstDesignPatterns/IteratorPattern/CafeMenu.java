package HeadFirstDesignPatterns.IteratorPattern;

import java.util.HashMap;

import java.util.Iterator;
import java.util.Map;

public class CafeMenu  implements Menu{
    Map<String, MenuItem> cafeMenu;

    CafeMenu(){
        cafeMenu =new HashMap<>();
        addItem("Frapaccino", "Cold Coffee with ice cream", 200);
        addItem("Death by Chocolate", "Dark Chocolate ice cream", 500);
    }
    void addItem(String name, String description, int amount){
        cafeMenu.put(name,new MenuItem(name,amount,description));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return cafeMenu.values().iterator();
    }
}
