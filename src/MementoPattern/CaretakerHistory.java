package MementoPattern;

import java.util.ArrayList;
import java.util.List;

public class CaretakerHistory {
    List<Memento> history = new ArrayList<>();
    void addMemento(Memento state){
        history.add(state);
    }
    Memento getLastMemento(){
        return history.getLast();
    }


}
