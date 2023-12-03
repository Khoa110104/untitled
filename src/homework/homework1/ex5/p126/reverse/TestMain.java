package homework.homework1.ex5.p126.reverse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            try {
                System.out.print("Option:\n1: Reverse the text entered.\n2: Reverse text read from file.\nYour option: ");
                choice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("The choice is not suitable. Please choose again");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    Reverse.reverseTextWithInput();
                    break;
                case 2:
                    Reverse.reverseWithReadFile();
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