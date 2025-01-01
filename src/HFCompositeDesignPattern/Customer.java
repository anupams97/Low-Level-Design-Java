package HFCompositeDesignPattern;

public class Customer {
    public static void main(String[] args) {
        Menu lousMenu = new Menu("Lous Menu", "BreakFast");
        Menu melsMenu = new Menu("Mels Menu","Dinner");
        Menu dessertMenu = new Menu("Dessert Menu", "Dessert");
        lousMenu.addItemInMenu(new MenuItem("Pancake", "Banana and Honey", 100));
        lousMenu.addItemInMenu(new MenuItem("Sandwich", "Egg/ Avocado", 150));
        lousMenu.addItemInMenu(new MenuItem("Omelette", "with bread", 200));

        melsMenu.addItemInMenu(new MenuItem("Steak", "Medium", 300));
        melsMenu.addItemInMenu(new MenuItem("Sausage", "Large", 500));

        dessertMenu.addItemInMenu(new MenuItem("Death by Chocolate ", "black forest ice cream", 120));
        dessertMenu.addItemInMenu(new MenuItem("CheeseCake", "Biscoff", 150));

        melsMenu.addItemInMenu(dessertMenu);
        Menu allMenus = new Menu("All Menus","All Menu's Combined");
        allMenus.addItemInMenu(lousMenu);
        allMenus.addItemInMenu(melsMenu);

        Waitress betty = new Waitress(allMenus);
        betty.display();







    }
}
