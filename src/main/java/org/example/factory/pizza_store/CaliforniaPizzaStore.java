package org.example.factory.pizza_store;

import org.example.factory.factoryMethodPizza.californiaPizzas.CaliforniaStyleCheesePizza;
import org.example.factory.factoryMethodPizza.californiaPizzas.CaliforniaStyleClamPizza;
import org.example.factory.factoryMethodPizza.californiaPizzas.CaliforniaStylePepperoniPizza;
import org.example.factory.factoryMethodPizza.californiaPizzas.CaliforniaStyleVeggiePizza;

public class CaliforniaPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CaliforniaStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new CaliforniaStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new CaliforniaStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new CaliforniaStylePepperoniPizza();
        } else return null;
    }
}
