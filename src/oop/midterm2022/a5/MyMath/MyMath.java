package oop.midterm2022.a5.MyMath;

import java.math.BigInteger;

public class MyMath {
    public MyMath() {
    }

    public static double cos(double x) {
        double result = 1, fraction = 1;
        int i = 2;
        while (Math.abs(result - Math.cos(x)) > 1e-12) {
            fraction = -fraction * x * x / i / (i - 1);
            result += fraction;
            i += 2;
        }
        return result;
    }

    public static double exp(double x) {
        double result = 1, fraction = 1;
        int i = 1;
        while (Math.abs(result - Math.exp(x)) > 1e-12) {
            fraction = fraction * x / i;
            result += fraction;
            i++;
        }
        return result;
    }

    public static String decimalTo(String in, int outRadix) {
        BigInteger dec = new BigInteger(in);
        String result = "";
        while (dec.compareTo(BigInteger.ZERO) > 0) {
            int temp = dec.mod(BigInteger.valueOf(outRadix)).intValue();
            if (temp < 10) {
                result = temp + result;
            } else {
                result = (char) (temp + 55) + result;
            }
            dec = dec.divide(new BigInteger(outRadix + ""));
        }
        return result;
    }

    public static String toDecimal(String in, int inRadix) {
        in = in.toUpperCase();
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < in.length(); i++) {
            char MyChar = in.charAt(i);
            if (MyChar >= '0' && MyChar <= '9') {
                int digit = MyChar - '0';
                result = result.multiply(BigInteger.valueOf(inRadix)).add(BigInteger.valueOf(digit));

            } else if (MyChar >= 'A' && MyChar <= 'F') {
                int digit = MyChar - 'A' + 10;
                result = result.multiply(BigInteger.valueOf(inRadix)).add(BigInteger.valueOf(digit));
            }
        }
        return result.toString();
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        if (inRadix == outRadix) {
            return in;
        }
        if (outRadix == 10) {
            return toDecimal(in, inRadix);
        }
        if (inRadix == 10) {
            return decimalTo(in, outRadix);
        }
        String dec = toDecimal(in, inRadix);
        return decimalTo(dec, outRadix);
    }


    public static void main(String[] args) {
        String result = "e^(2.2) * cos(3.3) = " + exp(2.2) * cos(3.3) + "\n";
        result += "using java libraries: " + Math.exp(2.2) * Math.cos(3.3) + "\n";
        result += "12345678912345678985686876765866756755765675678 in 13 to 8: " + toRadix("123456789123456789", 13, 8) + "\n";
        System.out.println(result);
    }
}


