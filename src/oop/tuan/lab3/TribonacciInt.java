package oop.tuan.lab3;

public class TribonacciInt {
    public static void main(String[] args) {
        int tribonacci1 = 1;
        int tribonacci2 = 1;
        int tribonacci3 = 2;
        System.out.println(tribonacci1);
        System.out.println(tribonacci2);
        System.out.println(tribonacci3);

        int nextTribonacci = tribonacci1 + tribonacci2 + tribonacci3;

        while (true) {
            if (Integer.MAX_VALUE < nextTribonacci) {
                System.out.println("con cac");
                break;
            }
            System.out.println(nextTribonacci);
            tribonacci1 = tribonacci2;
            tribonacci2 = tribonacci3;
            tribonacci3 = nextTribonacci;
        }
    }
}