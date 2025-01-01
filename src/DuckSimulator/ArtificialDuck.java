package DuckSimulator;

public class ArtificialDuck extends Duck {
    ArtificialDuck() {
        this.flyingBehaviour = new FlyWithRocket();
        this.quackingBehaviour = new Squeek();
    }
}
