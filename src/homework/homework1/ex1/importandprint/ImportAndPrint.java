package homework.homework1.ex1.importandprint;

import java.util.Scanner;

public class ImportAndPrint {

    public static void printValue(Object obj) {
        System.out.println("Result is: " + obj);
    }


    public static void main(String[] args) {
        //Các kiểu dữ kiệu cơ bản int , double, string, char
        Scanner scanner = new Scanner(System.in);

        //Integer
        System.out.print("Enter an integer: ");
        int valueInt = scanner.nextInt();
        printValue(valueInt);

        //Double
        System.out.print("Enter a double: ");
        double valueDou = scanner.nextDouble();
        printValue(valueDou);

        //String
        System.out.print("Enter a string: ");
        String str = scanner.next();
        printValue(str);

        //Char
        System.out.print("Enter a char: ");
        char charValue = scanner.next().charAt(0);
        printValue(charValue);
        scanner.close();
    }
}
