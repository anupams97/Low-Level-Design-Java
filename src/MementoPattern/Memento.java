package MementoPattern;

public class Memento {
    State state;
    Memento(State state){
        this.state = new State(state);
    }
    public State getState(){
        return this.state;
    }

}

//   Memento(State state){
//        this.state = new State(state);
//    }