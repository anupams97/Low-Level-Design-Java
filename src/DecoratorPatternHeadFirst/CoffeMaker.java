package DecoratorPatternHeadFirst;

public class CoffeMaker {
    public static void main(String[] args){
        Beverage e = new Espresso();
        e = new Mocha(e);
        e = new Whip(e);
        e = new Mocha(e);
        System.out.println(e.getDescription());
        System.out.println(e.getCost());
    }
}
