package DuckSimulator;

public abstract class Duck {
    FlyingBehaviour flyingBehaviour;
    QuackingBehavior quackingBehaviour;
    public void swim(){
        System.out.println("I am swimming");
    }
    public void fly(){
        flyingBehaviour.performFly();
    }
    public void quack(){
        quackingBehaviour.performQuack();
    }
    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour){
        this.flyingBehaviour = flyingBehaviour;
    }
    public void setQuackingBehaviour(QuackingBehavior quackingBehaviour){
        this.quackingBehaviour = quackingBehaviour;
    }
}
