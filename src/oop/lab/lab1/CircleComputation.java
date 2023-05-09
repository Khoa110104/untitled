package oop.lab.lab1;

import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = in.nextDouble();
        circleComputation(radius);
    }

    public static void circleComputation(double radius) {
        double diameter = 2 * radius;
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;
        System.out.printf("Diameter is : %.2f%n", diameter);
        System.out.printf("Circumference is : %.2f%n", circumference);
        System.out.printf("Area is : %.2f%n", area);
    }
}
