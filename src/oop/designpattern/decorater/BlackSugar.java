package oop.designpattern.decorater;

public class BlackSugar extends MilkTeaDecorator {
    public BlackSugar(MilkTea milkTea) {
        this.milkTea = milkTea;
    }

    @Override
    public String getDescription() {
        return milkTea.getDescription() + ", black sugar";
    }

    @Override
    public double cost() {
        return milkTea.cost() ;
    }
}
