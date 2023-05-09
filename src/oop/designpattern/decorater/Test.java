package oop.designpattern.decorater;

public class Test {
    public static void main(String[] args) {
        OnlyMilkTea onlyMilkTea = new OnlyMilkTea();
        System.out.println(onlyMilkTea.getDescription());
        System.out.println(onlyMilkTea.cost());

        System.out.println("-----------------------------------------");
        MilkTeaDecorator milkTeaDecorator = new BlackSugar(onlyMilkTea);
        System.out.println(milkTeaDecorator.getDescription());
        System.out.println("hìu:" + milkTeaDecorator.cost());

        System.out.println("------------------phun tốp con nhà bà pinh-----------------------");
        MilkTeaDecorator milkTeaDecorator1 = new BlackSugar(new Bubble(new EggPudding(new FruitBudding(new OnlyMilkTea()))));
        System.out.println(milkTeaDecorator1.getDescription());
        System.out.println("hìu:" + milkTeaDecorator1.cost());

    }
}
