package DecoratorPatternHeadFirst;

public class Espresso extends Beverage{
    Espresso(){
       description =  "Espresso";
    }
    public String getDescription(){
        return description;
    }
    public double getCost(){
        return 100;
    }
}
