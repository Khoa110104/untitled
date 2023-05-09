package oop.designpattern.decorater;

public class WhileBubble extends MilkTeaDecorator{
    public WhileBubble(MilkTea milkTea){
        this.milkTea = milkTea;
    }
    @Override
    public String getDescription() {
        return milkTea.getDescription() + ", while bubble";
    }

    @Override
    public double cost() {
        return milkTea.cost() + 12;
    }
}
