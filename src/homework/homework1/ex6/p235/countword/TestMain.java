package homework.homework1.ex6.p235.countword;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Count the number of occurrences of words in the text--------");

        int choice = 0;
        while (true) {
            try {
                System.out.print("Option:\n1: Enter using the keyboard.\n2: Read from file.\nYour option: ");
                choice= scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("The choice is not suitable. Please choose again");
                scanner.nextLine();
                continue;
            }
            switch (choice) {
                case 1:
                    WordCount.usingEnterFromKeyboard();
                    break;
                case 2:
                    WordCount.usingReadFile();
                    break;
                default:
                    System.out.println("The choice is not suitable. Please choose again");
            }
            System.out.println("You want to use the next program :\n1: Yes \n0: No");
            int continueSelect = scanner.nextInt();

            if (continueSelect == 0) {
                break;
            }
        }
    }
}
