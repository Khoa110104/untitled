package oop.tuan.lab2.grades;


import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        final int NUM_STUDENTS = in.nextInt();
        int[] myArray = inputStudentGrade(NUM_STUDENTS, in);
        in.close();
        System.out.printf("The average is: %.2f \n", getAverageGrade(myArray));
        System.out.println("The minimum is : " + getMinGrade(myArray));
        System.out.println("The maximum is : " + getMaxGrade(myArray));
    }

    public static int[] inputStudentGrade(int numStudents, Scanner sc) {
        if (numStudents <= 0) {
            return null;
        }
        int[] studentGrade = new int[numStudents];
        for (int ind = 0; ind < numStudents; ind++) {
            boolean isValid = false;
            while (!isValid) {
                System.out.print("Enter the grade for student " + (ind + 1) + ": ");
                int grade = sc.nextInt();
                if (grade >= 0 && grade <= 100) {
                    isValid = true;
                    studentGrade[ind] = grade;
                } else {
                    System.out.println("Invalid grade, input again");
                }
            }
        }
        sc.close();
        return studentGrade;
    }

    public static double getAverageGrade(int[] myArray) {
        if (myArray == null || myArray.length == 0) {
            return -1.0;
        }
        double sumOfGrade = 0.0;
        for (int ind = 0; ind < myArray.length; ind++) {
            sumOfGrade += myArray[ind];
        }
        return sumOfGrade / myArray.length;
    }

    public static int getMinGrade(int[] myArray) {
        if (myArray == null || myArray.length == 0) {
            return -1;
        }
        int min = myArray[0];
        for (int ind = 0; ind < myArray.length; ind++) {
            if (myArray[ind] <= min) {
                min = myArray[ind];
            }
        }
        return min;
    }

    public static int getMaxGrade(int[] myArray) {
        if (myArray == null || myArray.length == 0) {
            return -1;
        }
        int max = myArray[0];
        for (int ind = 0; ind < myArray.length; ind++) {
            if (max < myArray[ind]) {
                max = myArray[ind];
            }
        }
        return max;
    }
}