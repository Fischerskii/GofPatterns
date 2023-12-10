package org.example.decorator_sturbuzz;

public abstract class Beverage {
    String description = "Unknown Beverage";

    Size size = Size.GRAND;

    public enum Size {TALL, GRAND, VENTI;};

    public Size getSize() {
        return this.size = size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
