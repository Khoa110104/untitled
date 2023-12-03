package oop.homework.homework1.ex3.complexnumbers;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ComplexNumbers {
    private double real;
    private double imag;

    public ComplexNumbers(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    // Cộng 2 số phức
    public static ComplexNumbers add(ComplexNumbers another1, ComplexNumbers another2) {
        double newReal = another1.real + another2.real;
        double newImag = another1.imag + another2.imag;
        return new ComplexNumbers(newReal, newImag);
    }

    // Trừ 2 số phức
    public static ComplexNumbers subtract(ComplexNumbers another1, ComplexNumbers another2) {
        double newReal = another1.real - another2.real;
        double newImag = another1.imag - another2.imag;
        return new ComplexNumbers(newReal, newImag);
    }

    // Nhân 2 số phức
    public static ComplexNumbers multiply(ComplexNumbers another1, ComplexNumbers another2) {
        double newReal = another1.real * another2.real - another1.imag * another2.imag;
        double newImag = another1.real * another2.imag + another1.imag * another2.real;
        return new ComplexNumbers(newReal, newImag);
    }

    // Chia 2 số phức
    public static ComplexNumbers division(ComplexNumbers another1, ComplexNumbers another2) {
        double denominator = Math.pow(another2.real, 2) + Math.pow(another2.imag, 2);
        if (denominator == 0) {
            throw new ArithmeticException("Can't be divided!!!");
        }
        double newReal = (another1.real * another2.real + another1.imag * another2.imag) / denominator;
        double newImag = (another1.imag * another2.real - another1.real * another2.imag) / denominator;
        return new ComplexNumbers(newReal, newImag);
    }

    // Cộng nhiều số phức
    public static ComplexNumbers addManyComplexNumbers(ArrayList<ComplexNumbers> complexNumbers) {
        ComplexNumbers newComplexNumbers = complexNumbers.get(0);
        for (int i = 1; i < complexNumbers.size(); i++) {
            newComplexNumbers = add(newComplexNumbers, complexNumbers.get(i));
        }
        return newComplexNumbers;
    }

    // Trừ nhiều số phức
    public static ComplexNumbers subtractManyComplexNumbers(ArrayList<ComplexNumbers> complexNumbers) {
        ComplexNumbers newComplexNumbers = complexNumbers.get(0);
        for (int i = 1; i < complexNumbers.size(); i++) {
            newComplexNumbers = subtract(newComplexNumbers, complexNumbers.get(i));
        }
        return newComplexNumbers;
    }

    // Nhân nhiều số phức
    public static ComplexNumbers multiplyManyComplexNumbers(ArrayList<ComplexNumbers> complexNumbers) {
        ComplexNumbers newComplexNumbers = complexNumbers.get(0);
        for (int i = 1; i < complexNumbers.size(); i++) {
            newComplexNumbers = multiply(newComplexNumbers, complexNumbers.get(i));
        }
        return newComplexNumbers;
    }

    // Chia nhiều số phức
    public static ComplexNumbers divisionManyComplexNumbers(ArrayList<ComplexNumbers> complexNumbers) {
        ComplexNumbers newComplexNumbers = complexNumbers.get(0);
        for (int i = 1; i < complexNumbers.size(); i++) {
            newComplexNumbers = division(newComplexNumbers, complexNumbers.get(i));
        }
        return newComplexNumbers;
    }

    //In đúng định dạng số phức
    public void print() {
        if (real == 0) {
            System.out.println(imag + "i");
        } else {
            if (imag < 0) {
                System.out.println(real + " - " + Math.abs(imag) + "i");
            } else if (imag == 0) {
                System.out.println(real);
            } else {
                System.out.println(real + " + " + imag + "i");
            }
        }
    }

    //Tạo số phức
    public static ComplexNumbers inputComplexNumber() {
        Scanner scanner = new Scanner(System.in);
        double real = 0.0;
        double imag = 0.0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Real: ");
                real = scanner.nextDouble();
                System.out.print("Imag: ");
                imag = scanner.nextDouble();
                validInput =true;
            } catch (InputMismatchException e) {
                //In ra lỗi
                System.out.println("Invalid input!!");
                //Xóa đầu vào không hợp lệ
                scanner.nextLine();
            }
        }
        return new ComplexNumbers(real, imag);
    }
}
