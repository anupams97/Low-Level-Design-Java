package HeadFirstDesignPatterns.FactoryPattern.PizzaFactory;

import HeadFirstDesignPatterns.FactoryPattern.Pizzas.NewYorkStyleCheesePizza;
import HeadFirstDesignPatterns.FactoryPattern.Pizzas.Pizza;
import HeadFirstDesignPatterns.FactoryPattern.Pizzas.PizzaType;

public class NewYorkStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        if (pizzaType == PizzaType.Cheese){
            return new NewYorkStyleCheesePizza();
        }
        return null;
    }
}
