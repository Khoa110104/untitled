//public static void printFibonacciNumbers(int max) {
//        int fn;
//        int fnMinus1 = 1;
//        int fnMinus2 = 1;
//        double average = 2;
//        System.out.println("The first " + max + " Fibonacci numbers are:" + fnMinus1 + " " + fnMinus2);
//        for (int i = 2; i < max ; i++) {
//        fn = fnMinus1 + fnMinus2;
//        System.out.print(fn + " ");
//        fnMinus1 = fnMinus2;
//        fnMinus2 = fn;
//        average += fn;
//        }
//        System.out.println();
//        System.out.println("The average is "  + average / max);
//        }
//public static void printTribonacci(int max) {
//        int fnMinus1 = 1;
//        int fnMinus2 = 1;
//        int fnMinus3 = 2;
//        int fn;
//        System.out.print("The first " + max + " Tribonacci numbers are : " + fnMinus1 + " " + fnMinus2 + " " + fnMinus3 + " ");
//        for (int i = 2; i < max ; i++) {
//        fn = fnMinus1 + fnMinus2 + fnMinus3;
//        fnMinus1 = fnMinus2;
//        fnMinus2 = fnMinus3;
//        fnMinus3 = fn;
//        System.out.print(fn + " ");
//        }
//        }