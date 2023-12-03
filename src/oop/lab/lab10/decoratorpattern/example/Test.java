package oop.lab.lab10.decoratorpattern.example;

public class Test {
    public static void main(String[] args) {
        OnlyMilkTea onlyMilkTea = new OnlyMilkTea();
        System.out.println(onlyMilkTea.getDescription());
        System.out.println(onlyMilkTea.cost());

        System.out.println("-----------------------------------------");
        MilkTeaDecorator milkTeaDecorator = new BlackSugar(onlyMilkTea);
        System.out.println(milkTeaDecorator.getDescription());
        System.out.println("Cost:" + milkTeaDecorator.cost());

        System.out.println("-----------------------------------------");
        MilkTeaDecorator milkTeaDecorator1 = new BlackSugar(new Bubble(new EggPudding(new FruitBudding(new OnlyMilkTea()))));
        System.out.println(milkTeaDecorator1.getDescription());
        System.out.println("Cost:" + milkTeaDecorator1.cost());

    }
}
