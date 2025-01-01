package DuckSimulator;

public class MallardDuck extends Duck {
    MallardDuck() {
        // set flying behaviour and quacking behaviour
        this.flyingBehaviour = new FlyWithWings();
        this.quackingBehaviour = new Quack();
    }
}
