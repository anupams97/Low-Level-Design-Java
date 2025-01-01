package HFCompositeDesignPattern;

public abstract class MenuComponent {
    public void display(){
        throw new UnsupportedOperationException("This operation is not allowed");
    }
    public String getName(){
        throw new UnsupportedOperationException("This operation is not allowed");
    }
    public String getDescription(){
        throw new UnsupportedOperationException("This operation is not allowed");
    }
    public int  getPrice(){
        throw new UnsupportedOperationException("This operation is not allowed");
    }
    public void addItemInMenu(MenuComponent item){
        throw new UnsupportedOperationException("This operation is not allowed");
    }
    public void removeItemFromMenu(MenuComponent item){
        throw new UnsupportedOperationException("This operation is not allowed");
    }



}
