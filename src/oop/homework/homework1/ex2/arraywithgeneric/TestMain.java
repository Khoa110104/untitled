package oop.homework.homework1.ex2.arraywithgeneric;


import homework.homework1.ex2.arraywithgeneric.GenericArray;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Length of the array is: ");
        int length = scanner.nextInt();
        System.out.print("Option:\n1: Work with integer.\n2: Work with double.\nYour option: ");
        int choice = scanner.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    Integer[] arrayInt = new Integer[length];
                    System.out.print("Enter the elements: ");
                    for (int i = 0; i < arrayInt.length; i++) {
                        arrayInt[i] = scanner.nextInt();
                    }
                    GenericArray<Integer> genericArray = new GenericArray<>(arrayInt);
                    genericArray.printPrime(arrayInt);
                    System.out.println();
                    genericArray.printPerfectNumber(arrayInt);
                    System.out.println();
                    break;
                case 2:
                    Double[] arrayDou = new Double[length];
                    System.out.print("Enter the elements: ");
                    for (int i = 0; i < arrayDou.length; i++) {
                        arrayDou[i] = scanner.nextDouble();
                    }
                    GenericArray<Double> genericArray1 = new GenericArray<>(arrayDou);
                    genericArray1.printPrime(arrayDou);
                    System.out.println();
                    genericArray1.printPerfectNumber(arrayDou);
                    System.out.println();
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
