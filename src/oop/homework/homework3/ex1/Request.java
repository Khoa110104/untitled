package oop.homework.homework3.ex1;

import homework.homework3.ex1.Fraction;

import java.util.Scanner;

public class Request  {

    public static Fraction[] inputArrayFraction(Scanner scanner) {
        System.out.print("Size: ");
        int size = scanner.nextInt();
        Fraction[] arrayFraction = new Fraction[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Numerator " + (i+1) +": " );
            float numerator = scanner.nextFloat();
            System.out.print("Denominator " + (i+1) +": " );
            float denominator = scanner.nextFloat();
            arrayFraction[i] = new Fraction(numerator, denominator);
        }
        return arrayFraction;
    }
    public static void printFractionAtIndex(Fraction[] array, int index) {
        System.out.println("The element at position " + index + " in the array is: " + array[index-1]);
    }
    public static Fraction addFractions(Fraction[] array) {
        Fraction result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = result.add(array[i]);
        }
        System.out.print("The sum of the fractions of the array is: ");
        return result;
    }
    public static Fraction minusFractions(Fraction[] array) {
        Fraction result = new Fraction(0,1);
        for (int i =0; i < array.length; i++) {
            result = result.minus(array[i]);
        }
        System.out.print("The subtract of the fractions of the array is: ");
        return result;
    }
    public static Fraction multiplyFractions(Fraction[] array) {
        Fraction result = array[0];
        for (int i =1; i < array.length; i++) {
            result = result.multi(array[i]);
        }
        System.out.print("The product of fractions of the array is: ");
        return result;
    }
    public static Fraction divisionFractions(Fraction[] array) {
        Fraction result = new Fraction(1,1);
        for (int i =0 ; i <array.length; i++) {
            result = result.divi(array[i]);
        }
        System.out.print("The division of fractions in array is: ");
        return result;
    }
   public static Fraction calculateAverage(Fraction[] array) {
        int n = array.length;
        if (n == 0) {
            throw new IllegalArgumentException("NULL");
        }
       Fraction sum = array[0];
       for (int i = 1; i < array.length; i++) {
           sum = sum.add(array[i]);
       }
       System.out.print("The average of the elements of the array is: ");
       return new Fraction(sum.getNumerator(), sum.getDenominator() * n );
   }
}
