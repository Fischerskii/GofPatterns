package org.example.factory.factoryMethodPizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago style deep dish cheese pizza";
        dough = "Extra thick crust dough";
        sauce = "plum tomato sauce";

        toppings.add("Shredded mozzarella cheese pizza");
    }

    void cut() {
        System.out.println("cutting the pizza into square slices");
    }
}
