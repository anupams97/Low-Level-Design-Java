package HeadFirstDesignPatterns.FactoryPattern;

import HeadFirstDesignPatterns.FactoryPattern.PizzaFactory.NewYorkStylePizzaStore;
import HeadFirstDesignPatterns.FactoryPattern.PizzaFactory.PizzaStore;
import HeadFirstDesignPatterns.FactoryPattern.Pizzas.Pizza;
import HeadFirstDesignPatterns.FactoryPattern.Pizzas.PizzaType;

public class DemoPizza {
    public static void main(String[] args) {
        PizzaStore pz = new NewYorkStylePizzaStore();
        Pizza pizza = pz.orderPizza(PizzaType.Cheese);
        pizza.display();
    }

}
