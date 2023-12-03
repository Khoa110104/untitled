package homework.homework2.ex1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choiceInput = 0;
        System.out.println("--------Create array---------");
        try {
            System.out.print("Option:\n1: Input from keyboard.\n2: Randomly generated.\nYour option: ");
            choiceInput = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("The choice is not suitable. Please choose again");
            scanner.nextLine();
        }
        int[] array = new int[0];
        switch (choiceInput) {
            case 1:
                array = InputFromKeyboard.inputFromKeyboard();
                break;
            case 2:
                array = RandomNumber.randomNumber();
                break;
            default:
                System.out.println("The choice is not suitable. Please choose again");
        }
        int choiceSort = 0;
        System.out.println("--------Choose a sorting algorithm--------");
        try {
            System.out.print("Option:\n1: BubbleSort.\n" +
                    "2: SelectionSort.\n" +
                    "3: InsertionSort.\n" +
                    "4: MergeSort.\n" +
                    "5: QuickSort.\n" +
                    "Your option: ");
            choiceSort = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("The choice is not suitable. Please choose again");
            scanner.nextLine();
        }
        switch (choiceSort) {
            case 1:
                BubbleSort.bubbleSort(array);
                break;
            case 2:
                SelectionSort.selectionSort(array);
                break;
            case 3:
                InsertionSort.insertionSort(array);
                break;
            case 4:
                MergeSort.mergeSort(array, 0, array.length - 1);
                break;
            case 5:
                QuickSort.quickSort(array, 0, array.length - 1);
                System.out.println(Arrays.toString(array));
                break;
            default:
                System.out.println("The choice is not suitable. Please choose again");
        }
    }
}
