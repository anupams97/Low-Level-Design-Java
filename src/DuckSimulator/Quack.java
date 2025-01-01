package DuckSimulator;

public class Quack implements QuackingBehavior{
    @Override
    public void performQuack() {
        System.out.println("Quack");
    }
}
