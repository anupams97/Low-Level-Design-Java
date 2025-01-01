package DuckSimulator;

public class NoSound implements QuackingBehavior{
    public void performQuack() {
        System.out.println("No sound");
    }
}
