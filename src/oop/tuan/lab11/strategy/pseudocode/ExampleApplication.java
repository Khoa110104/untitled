package oop.tuan.lab11.strategy.pseudocode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) {
        Context context = new Context();
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Enter number a: ");
            long a = in.nextLong();
            System.out.print("Enter number b: ");
            long b = in.nextLong();
            System.out.print("Enter the calculation: ");
            String action = in.next().trim();
            if (action.equals("addition")) {
                context.setStrategy(new ConcreteStrategyAdd());
            } else if (action.equals("subtract")) {
                context.setStrategy(new ConcreteStrategySubtract());
            } else if (action.equals("multiplication")) {
                context.setStrategy(new ConcreteStrategyMultiply());
            }
            long result = context.executeStrategy(a, b);
            System.out.println(result);
        } catch (InputMismatchException | NullPointerException e) {
            e.printStackTrace();
        }
    }
}
