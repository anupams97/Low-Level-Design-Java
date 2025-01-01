package HeadFirstDesignPatterns.IteratorPattern;

public class Demo {
    public static void main(String[] args) {
        // programming to concrete implementation
        LousDinerMenu ld = new LousDinerMenu();
        MelsBreakfastMenu bk = new MelsBreakfastMenu();
        CafeMenu cm = new CafeMenu();
        ld.addItem(new MenuItem("Fried Rice",150, "Garlic with tomato and onions on rice"));
        ld.addItem(new MenuItem("Pasta",200, "Simple Garlic white pasta"));

        try{
            bk.addItem(new MenuItem("Pancake",150, "Banana Pancake"));
            bk.addItem(new MenuItem("Cereals ",200, "Mix fruit cereals"));
            bk.addItem(new MenuItem("Half Fried Eggs",150, "Half fried eggs with bread"));
        }catch(IllegalArgumentException e){
            System.out.println("Exception:" + e.getMessage());
        }

        Waitress betty = new Waitress(new Menu[]{ld,bk,cm});
        betty.printMenu();





    }
}
