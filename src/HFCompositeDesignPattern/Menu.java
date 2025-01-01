package HFCompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    List<MenuComponent> menu = new ArrayList<>();
    String name;
    String description;
    Menu(String name , String description){
        this.name = name;
        this.description = description;
    }
    public void display(){
        System.out.printf("\n" + getName() + " | ");
        System.out.printf(" " +getDescription());
        for(MenuComponent menuComponent : menu){
            menuComponent.display();
        }
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }

    public void addItemInMenu(MenuComponent item){
       menu.add(item);
    }
    public void removeItemFromMenu(MenuComponent item){
      menu.remove(item);
    }

}
