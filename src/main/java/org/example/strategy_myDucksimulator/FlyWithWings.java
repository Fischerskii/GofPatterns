package org.example.strategy_myDucksimulator;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("concrete fly");
    }
}
