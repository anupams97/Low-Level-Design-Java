package HeadFirstDesignPatterns.IteratorPattern;

//import java.util.List;
//import java.util.Iterator;
//
//public class LousIterator implements Iterator<MenuItem>{
//    List<MenuItem> lousMenu;
//    Integer position;
//    LousIterator(List<MenuItem> lousMenu){
//        this.lousMenu = lousMenu;
//        this.position = 0;
//    }
//    @Override
//    public MenuItem next() {
//        if (!hasNext()) {
//            throw new IllegalStateException("No more elements in the list");
//        }
//        return lousMenu.get(position++);
//    }
//
//    @Override
//    public boolean hasNext() {
//        return position < lousMenu.size();
//    }
//}
