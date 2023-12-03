package homework.homework1.ex2.arraywithgeneric;

public class GenericArray<T extends Number> {
    public final T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }
    private static boolean isPerfectNumber(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public void printPrime(T[] array) {
        int count = 0;
        System.out.print("Prime Number: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Integer) {
                int number = (int) array[i];
                if (isPrime(number)) {
                    System.out.print(number + " " );
                    count++;
                }
            }
        }
        if (count==0) {
            System.out.print("No prime numbers exist in the array.");
        }
    }
    public void printPerfectNumber(T[] array) {
        int count = 0;
        System.out.print("Perfect Number: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Integer) {
                int number = (int) array[i];
                if (isPerfectNumber(number)) {
                    System.out.print(number + " ");
                    count++;
                }
            }
        }
        if (count==0) {
            System.out.print("No perfect numbers exist in the array.");
        }
    }
}