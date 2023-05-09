package oop.lab.lab1;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        System.out.println(sumAverageUsingForLoop(3, 4));
        System.out.println(sumAverageUsingWhileLoop(5, 7));
        System.out.println(sumAverageUsingDoWhileLoop(1, 9));
        System.out.println(sumOfTheSquares());
        sumOfOddEven();
    }

    public static double sumAverageUsingForLoop(int lowerBound,
                                                int upperBound) {
        int sum = 0;
        int count = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
            count++;
        }
        return (double) sum / count;
    }

    public static double sumAverageUsingWhileLoop(int lowerBound,
                                                  int upperBound) {
        int sum = 0;
        int element = lowerBound;
        int count = 0;
        while (element <= upperBound) {
            sum += element;
            element++;
            count++;
        }
        return (double) sum / count;
    }

    public static double sumAverageUsingDoWhileLoop(int lowerBound,
                                                    int upperBound) {
        int sum = 0;
        int element = lowerBound;
        int count = 0;
        do {
            sum += element;
            element++;
            count++;
        } while (element <= upperBound);
        return (double) sum / count;
    }

    public static int sumOfTheSquares() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void sumOfOddEven() {
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sumOdd += i;
            } else {
                sumEven += i;
            }
        }
        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }
        System.out.println("Sum of even number: " + sumEven);
        System.out.println("Sum of odd number: " + sumOdd);
        System.out.println("absDiff: " + absDiff);
    }
}
