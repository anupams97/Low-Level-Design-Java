package HeadFirstDesignPatterns.FactoryPattern.PizzaFactory;

import HeadFirstDesignPatterns.FactoryPattern.Pizzas.Pizza;
import HeadFirstDesignPatterns.FactoryPattern.Pizzas.PizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType pizzaType){
        Pizza pizza;
        pizza = createPizza(pizzaType);
        return pizza;
    }
    protected abstract Pizza createPizza(PizzaType pizzaType);
}
