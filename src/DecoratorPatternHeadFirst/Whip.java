package DecoratorPatternHeadFirst;

public class Whip extends AddOns {
    Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription()+",Whip";
    }
    public double getCost(){
        return beverage.getCost()+ 20;
    }
}
