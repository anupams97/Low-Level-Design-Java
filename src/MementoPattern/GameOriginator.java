package MementoPattern;

public class GameOriginator {
    private State playerState;

    public void setState(State state){
        this.playerState = state;
    }

    public Memento saveProgressMemento(State state){
        return new Memento(state);
    }

    public void restore(Memento saved){
        this.playerState = saved.getState();


    }
    public void displayStats(){
        System.out.println("level:"+playerState.level+" power: "+playerState.power+" health:"+playerState.health+" money: "+playerState.money+" isAlive: "+playerState.isAlive);
    }





}
