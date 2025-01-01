package DecoratorPatternHeadFirst;

public class Mocha extends AddOns{
    Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.getDescription()+",Mocha";
    }
    public double getCost(){
        return beverage.getCost()+ 20;
    }
}
