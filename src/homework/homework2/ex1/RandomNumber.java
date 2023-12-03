package homework.homework2.ex1;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static int[] randomNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Length: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            int x = random.nextInt((int) Math.pow(10, 6) + 1);
            array[i] = x;
        }
        return array;
    }
}
