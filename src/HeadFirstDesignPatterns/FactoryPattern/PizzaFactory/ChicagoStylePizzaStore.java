package HeadFirstDesignPatterns.FactoryPattern.PizzaFactory;

import HeadFirstDesignPatterns.FactoryPattern.Pizzas.ChicagoStyleCheesePizza;
import HeadFirstDesignPatterns.FactoryPattern.Pizzas.Pizza;
import HeadFirstDesignPatterns.FactoryPattern.Pizzas.PizzaType;

public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        if (pizzaType == PizzaType.Cheese){
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
