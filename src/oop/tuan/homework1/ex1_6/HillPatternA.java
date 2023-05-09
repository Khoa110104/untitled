package oop.tuan.homework1.ex1_6;

public class HillPatternA {
    public static void printHillPatternA(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size * 2 - 1; col++) {
                if (col >= size - 1 - row && col <= size - 1 + row) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printHillPatternA(5);
    }
}
