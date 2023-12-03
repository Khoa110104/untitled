package homework.homework3.ex1;

import java.util.Arrays;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter a series of n fractions
        Fraction[] arrayFraction = Request.inputArrayFraction(scanner);
        System.out.println("Array Fraction: " + Arrays.toString(arrayFraction));
        //Print out the fraction in the vth position in the sequence.
        System.out.print("Location you want to print: ");
        int index = scanner.nextInt();
        Request.printFractionAtIndex(arrayFraction, index);

        //Calculate the sum of n fractions
        System.out.println(Request.addFractions(arrayFraction));
        //Calculate the difference of n fractions
        System.out.println(Request.minusFractions(arrayFraction));
        //Calculate the product of n fractions
        System.out.println(Request.multiplyFractions(arrayFraction));
        //Calculate the quotient of n fractions
        System.out.println(Request.divisionFractions(arrayFraction));
        //Calculate the average fraction in the array
        System.out.println(Request.calculateAverage(arrayFraction));
    }
}
