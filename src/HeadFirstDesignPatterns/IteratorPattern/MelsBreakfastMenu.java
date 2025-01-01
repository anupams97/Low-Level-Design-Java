package HeadFirstDesignPatterns.IteratorPattern;

import java.util.Iterator;

public class MelsBreakfastMenu implements Menu{
    final int  maxMenuSize = 2;
    int position =0;
    MenuItem[] melsMenu;
    MelsBreakfastMenu(){
        // TODO: add item responsibilty should be here not in demo
        this.melsMenu = new MenuItem[maxMenuSize];
    }
    public void addItem(MenuItem item){
        if(position <maxMenuSize){
            melsMenu[position]= item;
            position++;
        }else{
            throw new IllegalArgumentException("Menu limit exceeded! Cannot add more items in menu");
        }
    }

    // TODO: getMenu not needed leaks internal information of data  structure used.

    public MenuItem[] getMenu(){
        return melsMenu;
    }
    public Iterator<MenuItem> createIterator(){
        return new MelsIterator(melsMenu);
    }
}
