package oop.homework.homework1.ex2.array;

import homework.homework1.ex2.array.Array;

import java.util.Scanner;

public class TestArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Tạo mảng
        System.out.print("Length of the array is: ");
        int length = scanner.nextInt();
        int[] array = homework.homework1.ex2.array.Array.inputArray(length);
        homework.homework1.ex2.array.Array.printArray(array);

        // 2 lựa chọn: in ra sô nguyên tố hoặc in ra số hoàn hảo trong mảng
        while (true) {
            System.out.println("Option:\n1: Print out the elements that are prime numbers." +
                    "\n2: Print out elements that are perfect numbers.");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    homework.homework1.ex2.array.Array.printPrime(array);
                    break;
                case 2:
                    Array.printPerfectNumber(array);
                    break;
            }
            System.out.println("Do you want to continue using the program? : \n1: Yes \n0: No");
            int continueSelect = scanner.nextInt();
            if (continueSelect == 0) {
                break;
            }
        }
    }

}
