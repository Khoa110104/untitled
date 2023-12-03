package homework.homework1.ex4.sphere;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sphere {
    private double radius;
    private double x;
    private double y;
    private double z;

    public Sphere(double radius, double x, double y, double z) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    // Diện tích xung quanh hình cầu
    public double surroundingArea() {
        return Math.PI * 4 * Math.pow(radius, 2);
    }

    // Thể tích hình cầu
    public double volume() {
        return 4.0 / 3 * Math.PI * Math.pow(radius, 3);
    }

    // Tính khoảng cách 2 tâm
    public static double distanceCentral(Sphere another1, Sphere another2) {
        return Math.sqrt(Math.pow(another1.x - another2.x, 2) +
                Math.pow(another1.y - another2.y, 2) +
                Math.pow(another1.z - another2.z, 2));
    }

    // Kiểm tra bao nhau
    public static boolean isContain(Sphere another1, Sphere another2) {
        double distanceCentral = distanceCentral(another1, another2);
        return Math.abs(another1.radius - another2.radius) > distanceCentral;
    }

    // Kiểm tra giao nhau
    public static boolean isIntersect(Sphere another1, Sphere another2) {
        double distanceCentral = distanceCentral(another1, another2);

        return another1.radius - another2.radius < distanceCentral && distanceCentral < another1.radius + another2.radius;
    }

    // Kiểm tra tiếp xúc trong
    public static boolean internalContact(Sphere another1, Sphere another2) {
        double distanceCentral = distanceCentral(another1, another2);
        return distanceCentral == another1.radius - another2.radius;
    }

    // Kiểm tra tiếp xúc ngoài
    public static boolean externalContact(Sphere another1, Sphere another2) {
        double distanceCentral = distanceCentral(another1, another2);
        return distanceCentral == another1.radius + another2.radius;
    }

    // Tạo hình cầu
    public static Sphere inputSphere() {
        Scanner scanner = new Scanner(System.in);
        double radius = 0.0, x = 0.0, y = 0.0, z = 0.0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Radius: ");
                radius = scanner.nextDouble();
                System.out.print("x: ");
                x = scanner.nextDouble();
                System.out.print("y: ");
                y = scanner.nextDouble();
                System.out.print("z: ");
                z = scanner.nextDouble();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input!!!");
                scanner.nextLine();
            }
        }
        return new Sphere(radius, x, y, z);
    }
}
