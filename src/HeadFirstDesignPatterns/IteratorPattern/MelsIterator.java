package HeadFirstDesignPatterns.IteratorPattern;

import java.util.Iterator;

public class MelsIterator implements Iterator<MenuItem> {
    int position;
    MenuItem[] melsMenu;
    MelsIterator(MenuItem[] melsMenu){
        this.melsMenu = melsMenu;
        this.position = 0;
    }
    @Override
    public MenuItem next() {
       return melsMenu[position++];
    }

    @Override
    public boolean hasNext() {
        return position < melsMenu.length && melsMenu[position] != null;
    }
}
