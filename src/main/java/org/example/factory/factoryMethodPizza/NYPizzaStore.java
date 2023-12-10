package org.example.factory.factoryMethodPizza;

import org.example.factory.factoryMethodPizza.nyPizzas.NYStyleCheesePizza;
import org.example.factory.factoryMethodPizza.nyPizzas.NYStyleClamPizza;
import org.example.factory.factoryMethodPizza.nyPizzas.NYStyleVeggiePizza;
import org.example.factory.factoryMethodPizza.nyPizzas.NyStylePepperoniPizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NyStylePepperoniPizza();
        } else return null;
    }
}
