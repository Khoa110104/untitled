package oop.lab.homework1;

public class BaseSystem {
    public static void main(String[] args) {
        String hexString = "1a";
        System.out.println("Hex to Dex Using Power: " + hex2DecUsingPower(hexString));
        System.out.println("Hex to Dec Using Term: " + hex2DecUsingTerm(hexString));
        System.out.println("Hex to Dec Using Horner: " + hex2DecUsingHorner(hexString));
    }

    public static int valueIndex(char hexChar) {
        final String HEX_STRING = "0123456789ABCDEF";
        return HEX_STRING.indexOf(hexChar);
    }

    public static int hex2DecUsingPower(String hexString) {
        if (isHexString(hexString)) {
            return -1;
        }
        int sum = 0;
        int n = hexString.length();
        for (int i = 0; i < hexString.length(); i++) {
            sum += valueIndex(hexString.charAt(i)) * ((int) Math.pow(16, n - 1 - i));
        }
        return sum;
    }

    public static int hex2DecUsingTerm(String hexString) {
        if (isHexString(hexString)) {
            return -1;
        }

        int sum = 0;
        int term = 16;
        for (int i = hexString.length() - 1; i >= 0; i--) {
            sum += valueIndex(hexString.charAt(i)) * term;
            term *= 16;
        }
        return sum;
    }

    public static int hex2DecUsingHorner(String hexString) {
        if (isHexString(hexString)) {
            return -1;
        }
        int sum = valueIndex(hexString.charAt(0));
        for (int i = 0; i < hexString.length(); i++) {
            sum = sum * 16 + valueIndex(hexString.charAt(i));
        }
        return sum;
    }

    public static boolean isHexString(String myString) {
        if (myString == null || myString == "") {
            return false;
        }
        for (int i = 0; i < myString.length(); i++) {
            if (valueIndex(myString.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}
