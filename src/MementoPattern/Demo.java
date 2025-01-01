package MementoPattern;

public class Demo {
    public static void main(String[] args) {
        CaretakerHistory c = new CaretakerHistory();
        GameOriginator g = new GameOriginator();
        State ps = new State();

        g.setState(ps);
        g.displayStats();
        ps.loot(10);
        ps.loot(1000);
        ps.takeDamage(50);
        ps.drinkElexir(10);
        ps.drinkProtien(100);
        ps.completeLevel();



        g.setState(ps);
        g.displayStats();
        c.addMemento(g.saveProgressMemento(ps));
        ps.takeDamage(50);



        g.setState(ps);
        g.displayStats();
        g.restore(c.getLastMemento());

        g.displayStats();

    }
}
