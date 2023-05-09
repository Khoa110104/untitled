package oop.lab.lab1;

import java.util.Scanner;

public class SphereComputation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = in.nextDouble();
        sphereComputation(radius);
    }

    public static void sphereComputation(double radius) {
        double surfaceArea = 4 * Math.PI * radius * radius;
        double volume = ((double) 4 / 3) * Math.PI * radius * radius * radius;
        System.out.printf("SurfaceArea is: %.2f%n", surfaceArea);
        System.out.printf("Volume is: %.2f%n ", volume);
    }
}
