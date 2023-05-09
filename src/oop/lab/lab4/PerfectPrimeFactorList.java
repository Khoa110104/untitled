package oop.lab.lab4;

import java.util.Scanner;

public class PerfectPrimeFactorList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the upper bound: ");
        int aPosInt = in.nextInt();
        int count = 0;
        for (int i = 2; i <= aPosInt; i++) {
            if (isProductOfPrimeFactors(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.printf("\n[%d number found (%.2f%c)]", count,
                (double) count / aPosInt * 100, '%');
    }

    public static boolean isProductOfPrimeFactors(int number) {
        int product = 1;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0 && PrimeList.isPrime(i)) {
                product = product * i;
                if (product > number) {
                    return false;
                }
            }
        }
        return product == number;
    }
}
