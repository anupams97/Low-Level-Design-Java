package MementoPattern;

public class State {
    int level;
    int health;
    int power;
    int money;
    boolean isAlive;
    State(){
        this.level = 0;
        this.health = 100;
        this.power = 10;
        this.money = 10;
        isAlive = true;
    }
    // Copy constructor
    public State(State other) {
        this.level = other.level;
        this.health = other.health;
        this.power = other.power;
        this.money = other.money;
        this.isAlive = other.isAlive;
    }
    public void completeLevel(){
        level++;
    }
    public void drinkElexir(int health){
        if(this.health+health>=100){
            this.health = 100;
            return;
        }
        this.health+=health;
    }
    public void takeDamage(int damage){
        if(health-damage<=0) {
            isAlive = false;
            health=0;
            return;
        }
        health-=damage;
    }
    public void loot(int money){
        this.money+=money;
    }
    public void drinkProtien(int protienPowder){
        power+=protienPowder/10;
    }


}
