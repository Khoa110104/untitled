package oop.designpattern.decorater;

public abstract class MilkTea  {
    String description = "MileTea";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}

