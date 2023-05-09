package oop.midterm2022.a3.mymath;

public class MyMath {
    public MyMath() {

    }

    public static double cos(double x) {
        double fraction = 1, result = 1;
        int i = 2;
        while (Math.abs(result - Math.cos(x)) > 1e-12) {
            fraction = -fraction * x * x / i / (i - 1);
            result += fraction;
            i += 2;
        }
        return result;
    }

    public static double exp(double x) {
        double fraction = 1, result = 1;
        int i = 1;
        while (Math.abs(result - Math.exp(x)) > 1e-12) {
            fraction *= x / i;
            result += fraction;
            i++;
        }
        return result;
    }

    public static double sin(double x) {
        double fraction = x, result = x;
        int i = 3;
        while (Math.abs(result - Math.sin(x)) > 1e-12) {
            fraction = -fraction * x * x / i / (i - 1);
            result += fraction;
            i += 2;
        }
        return result;
    }

    public static double ln(double a) {
        double x = a - 1, fraction = x, result = x;
        int i = 2;
        while (Math.abs(result - Math.log1p(x)) > 1e-12) {
            fraction = -fraction * x / i * (i - 1);
            result += fraction;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ln(1.5) + exp(2.2) + sin(1.7) + cos(3.1));
        System.out.println(Math.log(1.5) + Math.exp(2.2) + Math.sin(1.7) + Math.cos(3.1));
    }
}
