package oop.tuan.lap1;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        int count = 1;
        double average = 0;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;
        for (int i = LOWERBOUND; i <= UPPERBOUND; ++i) {
            sum += i*i;
            count++;
        }
        average = (double) sum / count;
        System.out.println(sum + average);
    }
}
