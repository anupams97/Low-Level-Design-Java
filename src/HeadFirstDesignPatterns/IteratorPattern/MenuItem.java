package HeadFirstDesignPatterns.IteratorPattern;

public class MenuItem {
    String name;
    int amount;
    String description;
    MenuItem(String name, int amount, String description){
        this.name=name;
        this.amount=amount;
        this.description=description;
    }
    //TODO: why no getters ?

}
