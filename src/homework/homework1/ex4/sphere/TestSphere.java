package homework.homework1.ex4.sphere;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Tạo hình cầu 1
        System.out.println("Sphere1:");
        Sphere sphere1 = Sphere.inputSphere();

        // Tính diện tích xung quanh và thể tích
        System.out.println("The area around the sphere1 is : " + sphere1.surroundingArea());
        System.out.println("The volume of a sphere1 is : " + sphere1.volume());

        // Tạo hình cầu 2
        System.out.println("Sphere2:");
        Sphere sphere2 = Sphere.inputSphere();

        // Tính diện tích xung quanh và thể tích
        System.out.println("The area around the sphere2 is : " + sphere2.surroundingArea());
        System.out.println("The volume of a sphere2 is : " + sphere2.volume());

        // Vị trí tương quan của hai hình cầu
        System.out.println("Do you want to find the relative position of two spheres?");
        int choice = 0;
        try {
            System.out.print("Option\n1: Yes\n2: No\nYour option: ");
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("The choice is not suitable. Please choose again");
            scanner.nextLine();
        }
        switch (choice) {
            case 1:
                System.out.println("Relative position sphere1 and sphere2: ");
                if (Sphere.isContain(sphere1, sphere2)) {
                    System.out.println("The two spheres contain each other.");
                } else if (Sphere.isIntersect(sphere1, sphere2)) {
                    System.out.println("The two spheres intersect.");
                } else if (Sphere.internalContact(sphere1, sphere2)) {
                    System.out.println("The two spheres are in internal contact(The center of sphere2 is inside sphere1).");
                } else if (Sphere.externalContact(sphere1, sphere2)) {
                    System.out.println("The two spheres are in external contact(The center of sphere1 is inside sphere2).");
                } else {
                    System.out.println("The two spheres are unrelated.");
                }
                break;
            case 2:
                break;
        }
    }
}
