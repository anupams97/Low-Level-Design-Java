package HFCompositeDesignPattern;

public class MenuItem extends MenuComponent{
    String name;
    String description;
    int  price;
    MenuItem(String name, String description, int price){
        this.name=name;
        this.description = description;
        this.price = price;
    }
    public void display(){
        System.out.printf("\nName: %s, Description: %s, Price: %s ", getName(),getDescription(),getPrice());
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public int  getPrice(){
        return price;
    }
}
