package oop.homework.homework1.ex3.complexnumbers;

import homework.homework1.ex3.complexnumbers.ComplexNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        //Tạo 2 số phức
        Scanner scanner = new Scanner(System.in);
        System.out.println("ComplexNumber1: ");
        ComplexNumbers complexNumber1 = ComplexNumbers.inputComplexNumber();
        complexNumber1.print();
        System.out.println("ComplexNumber2: ");
        ComplexNumbers complexNumber2 = ComplexNumbers.inputComplexNumber();
        complexNumber2.print();

        //Phép toán với 2 số phức
        System.out.println("Two complex numbers: complexNumbers1 and complexNumbers2");
        while (true) {
            System.out.println("Option:\n1: Add\n2: Minus\n3: Multiply\n4: Division\n-------------------\nYour option: ");
            int choice = scanner.nextInt();
            System.out.print("Result: ");
            switch(choice) {
                case 1 :
                    ComplexNumbers.add(complexNumber1, complexNumber2).print();
                    break;
                case 2:
                    ComplexNumbers.subtract(complexNumber1, complexNumber2).print();
                    break;
                case 3:
                    ComplexNumbers.multiply(complexNumber1, complexNumber2).print();
                    break;
                case 4:
                    ComplexNumbers.division(complexNumber1, complexNumber2).print();
                    break;
            }
            System.out.println("Do you want to go back or move to a program with multiple numbers? : \n1: Stay \n0: Convert");
            int continueSelect = scanner.nextInt();
            if (continueSelect == 0) {
                break;
            }
        }

        //Tạo thêm 2 số phức
        System.out.println("ComplexNumber3: ");
        ComplexNumbers complexNumber3 = ComplexNumbers.inputComplexNumber();
        complexNumber3.print();
        System.out.println("ComplexNumber4: ");
        ComplexNumbers complexNumber4 = ComplexNumbers.inputComplexNumber();
        complexNumber4.print();

        ArrayList<ComplexNumbers> arr = new ArrayList<>();
        arr.add(complexNumber1);
        arr.add(complexNumber2);
        arr.add(complexNumber3);
        arr.add(complexNumber4);

        //Phép toán với nhiều số phức
        System.out.println("Many complex numbers: complexNumbers1, complexNumbers2, complexNumbers3 ,complexNumbers4");
        while (true) {
            System.out.println("Option:\n1: Add\n2: Subtract\n3: Multiply\n4: Division\n-------------------\nYour option: ");
            int choice = scanner.nextInt();
            switch(choice) {
                case 1 :
                    ComplexNumbers.addManyComplexNumbers(arr).print();
                    break;
                case 2:
                    ComplexNumbers.subtractManyComplexNumbers(arr).print();
                    break;
                case 3:
                    ComplexNumbers.multiplyManyComplexNumbers(arr).print();
                    break;
                case 4:
                    ComplexNumbers.divisionManyComplexNumbers(arr).print();
                    break;
            }
            System.out.println("You want to use the next program : \n1 : Yes \n0: No");
            int continueSelect = scanner.nextInt();
            if (continueSelect == 0) {
                break;
            }
        }
    }
}
