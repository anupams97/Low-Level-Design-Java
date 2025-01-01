package DuckSimulator;

public class NoFly implements FlyingBehaviour{

    @Override
    public void performFly() {
        System.out.println("No fly capability");
    }
}
