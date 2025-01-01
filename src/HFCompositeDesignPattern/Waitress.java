package HFCompositeDesignPattern;

public class Waitress {
    MenuComponent allMenus;

    Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    public void display(){
        allMenus.display();
    }
}
