package oop.final2021.trapezoidal;

public class Trapezoidal {
    private static double f(double x) {
        return Math.pow(Math.sin(x), 2) * Math.cos(x);
    }
    private static double l(double a, double b, int n) {
        double h = (b-a) / n;
        double sum = (f(a) +f(b)) / 2;
        for (int i = 1 ; i < n; i++) {
            double x = a + i * h;
            sum+=f(x);
        }
        return sum * h;
    }
    private static double trapezoidal(double a, double b, double error) {
        int n = 2;
        double before = l(a, b, n);
        double current;
        while (true) {
            n*=2;
            current = l(a,b,n);
            if (Math.abs(current-before) < error) {
                break;
            }
            before = current;
        }
        return current;
    }

    public static void main(String[] args) {
        System.out.println(trapezoidal(0, Math.PI / 2, 1e-6));
    }
}
