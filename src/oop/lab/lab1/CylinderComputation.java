package oop.lab.lab1;

import java.util.Scanner;

public class CylinderComputation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = in.nextDouble();
        System.out.print("Enter the height: ");
        double height = in.nextDouble();
        cylinderComputation(radius, height);
    }

    public static void cylinderComputation(double radius, double height) {
        double baseArea = Math.PI * radius * radius;
        double surfaceArea = 2.0 * Math.PI + 2.0 * baseArea;
        double volume = baseArea + height;
        System.out.printf("The BaseArea is : %.2f%n", baseArea);
        System.out.printf("The SurfaceArea is : %.2f%n", surfaceArea);
        System.out.printf("The Volume is : %.2f%n", volume);
    }
}
