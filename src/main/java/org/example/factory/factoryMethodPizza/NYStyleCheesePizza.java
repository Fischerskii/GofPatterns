package org.example.factory.factoryMethodPizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and cheese pizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";

        toppings.add("Grated reggiano cheese");
    }
}
