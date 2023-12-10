package org.example.strategy_myDucksimulator;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("ConcreteQuack");
    }
}
