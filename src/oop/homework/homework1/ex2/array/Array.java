package oop.homework.homework1.ex2.array;

import java.util.Scanner;

public class Array {

    // Tạo mảng
    public static int[] inputArray(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    // In ra mảng
    public static void printArray(int[] array) {
        System.out.print("Array:[ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    // Kiểm tra số nguyên tố
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // In ra số nguyên tố trong mảng
    public static void printPrime(int[] array) {
        int count = 0;
        System.out.print("Prime Number: ");
        for (int i : array) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count==0) {
            System.out.print("No prime numbers exist in the array.");
        }
        System.out.println();
    }

    // Kiểm tra số hoàn hảo
    private static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

    // In ra số hoàn hảo trong mảng
    public static void printPerfectNumber(int[] array) {
        int count = 0;
        System.out.print("Perfect Number: ");
        for (int i : array) {
            if (isPerfectNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count==0){
            System.out.print("No perfect numbers exist in the array.");
        }
        System.out.println();
    }
}
