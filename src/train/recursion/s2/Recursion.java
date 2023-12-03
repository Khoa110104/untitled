package train.recursion.s2;

public class Recursion {
    void count(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            count(n - 1);
        }
    }

    int factorial(int n) {
        if (n <= 0) {
            return 1;
        } else {
            int fac = n * factorial(n - 1);
            return fac;
        }
    }

    int fibonacci(int n) {
        if (n <= 2)
            return 1;
        int fn = fibonacci(n - 1) + fibonacci(n - 2);
        return fn;
    }

    static void towerOfHaNoi(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Moving disk " + n + " from " + a + " to " + c);
        } else {
            towerOfHaNoi(n - 1, a, c, b);
            System.out.println("Moving disk " + n + " from " + a + " to " + c);
            towerOfHaNoi(n - 1, b,a,c);
        }

    }

    public static void main(String[] args) {
        System.out.print("Count: ");
        new Recursion().count(10);

        System.out.println("\n--------------------");
        System.out.println("Factorial: " + new Recursion().factorial(7) +"\n--------------------");

        System.out.println("Fibonacci: " + new Recursion().fibonacci(5));
        System.out.println("--------------------\nTower of Ha Noi(A ----> C): ");
        towerOfHaNoi(3, 'A','B','C');

    }
}
