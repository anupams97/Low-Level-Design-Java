package HeadFirstDesignPatterns.IteratorPattern;

import java.util.Iterator;
import java.util.List;

public class Waitress {

    Menu[] menuList;
    Waitress(Menu[] menuList){
        this.menuList= menuList;
    }

    void printMenu(){
        for(Menu menu : menuList){
            System.out.println(menu.getClass().getSimpleName());
            printMenuHelper(menu.createIterator());
            System.out.println("__________________________\n");
        }
    }
    void printMenuHelper(Iterator<MenuItem> i){

        while(i.hasNext()){
            MenuItem m = i.next();

            //TODO : instead of m.name m.getName why directly accessing other classes member variable ?
            System.out.println(m.name+" "+ m.amount+ " "+ m.description);
        }
    }

}
