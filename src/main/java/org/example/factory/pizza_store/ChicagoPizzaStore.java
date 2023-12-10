package org.example.factory.pizza_store;

import org.example.factory.factoryMethodPizza.chicagoPizzas.ChicagoStyleCheesePizza;
import org.example.factory.factoryMethodPizza.chicagoPizzas.ChicagoStyleClamPizza;
import org.example.factory.factoryMethodPizza.chicagoPizzas.ChicagoStylePepperoniPizza;
import org.example.factory.factoryMethodPizza.chicagoPizzas.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
