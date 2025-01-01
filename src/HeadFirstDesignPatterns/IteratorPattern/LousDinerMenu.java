package HeadFirstDesignPatterns.IteratorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LousDinerMenu implements Menu{
    List<MenuItem> lousMenu;
     LousDinerMenu(){
        this.lousMenu = new ArrayList<>();
    }

    public void addItem(MenuItem item){
        lousMenu.add(item);
    }
    public List<MenuItem> getMenu(){
        return lousMenu;
    }

    // TODO: we used lousmenu.iterator() here List already implements the java iterator.
    public Iterator<MenuItem> createIterator(){
         return lousMenu.iterator();

    }
}
