package DuckSimulator;

public class Squeek implements QuackingBehavior {
    @Override
    public void performQuack() {
        System.out.println("I'm squeeking.");
    }
}
