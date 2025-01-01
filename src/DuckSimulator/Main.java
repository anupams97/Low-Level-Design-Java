package DuckSimulator;

public class Main {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        System.out.println(duck);
        duck.swim();
        duck.fly();
        duck.quack();
        System.out.println();
        Duck duck2 = new ArtificialDuck();
        System.out.println(duck2);
        duck2.swim();
        duck2.fly();
        duck2.quack();
        System.out.println();
        duck2.setFlyingBehaviour(new NoFly());
        duck2.setQuackingBehaviour(new NoSound());
        duck2.swim();
        duck2.fly();
        duck2.quack();

    }
}
