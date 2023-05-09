package oop.lab.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
    public static int[] grades;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] grades = arrayOfStudent(in);
        print(grades);
        System.out.printf("The average is: %.2f\n", average(grades));
        System.out.printf("The median is: %.2f\n", median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f\n", stdDev(grades));
    }

    public static int[] arrayOfStudent(Scanner in) {
        System.out.print("Enter the number of student: ");
        int numberStudent = in.nextInt();
        int[] grades = new int[numberStudent];
        if (grades.length > 0) {
            for (int i = 0; i < grades.length; i++) {
                boolean isValid;
                isValid = false;
                while (!isValid) {
                    System.out.print("Enter the grade for student " + (i + 1) + ": ");
                    grades[i] = in.nextInt();
                    if (grades[i] >= 0 && grades[i] <= 100) {
                        isValid = true;
                    } else {
                        System.out.println("Invalid input, try again...");
                    }
                }

            }
        }
        in.close();
        return grades;
    }

    public static void print(int[] grades) {
        System.out.print("The grades are: [");
        for (int i = 0; i < grades.length; i++) {
            if (i == 0) {
                System.out.print(grades[i]);
            } else {
                System.out.print(", " + grades[i]);
            }
        }
        System.out.println("]");
    }

    public static double average(int[] grades) {
        if (grades.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return sum / grades.length;
    }

    public static double median(int[] grades) {
        Arrays.sort(grades);
        double median;
        if (grades.length % 2 == 0) {
            median = (grades[grades.length / 2 - 1] + grades[grades.length / 2]) / 2.0;

        } else {
            median = grades[grades.length / 2];
        }
        return median;
    }

    public static int max(int[] grades) {
        if (grades.length == 0) {
            return 0;
        }
        int max = grades[0];
        for (int i = 1; i < grades.length; i++) {
            max = (max < grades[i]) ? grades[i] : max;
        }
        return max;
    }

    public static int min(int[] grades) {
        if (grades.length == 0) {
            return 0;
        }
        int min = grades[0];
        for (int i = 1; i < grades.length; i++) {
            min = (min > grades[i]) ? grades[i] : min;
        }
        return min;
    }

    public static double stdDev(int[] grades) {
        double result = 0;
        final double MEAN_SQUARE = Math.pow(average(grades), 2);
        for (int grade : grades) {
            result += grade * grade - MEAN_SQUARE;
        }
        return Math.sqrt(result / grades.length);
    }
}

