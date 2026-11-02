import java.util.Scanner;

class Fibonacci {

    // Non-Recursive Method
    static int fibonacciIterative(int n) {
        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return a;
    }

    // Recursive Method
    static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacciRecursive(n - 1)
             + fibonacciRecursive(n - 2);
    }

    // Main Method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Enter a non-negative number.");
        } else {
            System.out.println("Fibonacci using Non-Recursive Method: "
                    + fibonacciIterative(n));

            System.out.println("Fibonacci using Recursive Method: "
                    + fibonacciRecursive(n));

            System.out.println("Fibonacci Series:");

            for (int i = 0; i <= n; i++) {
                System.out.print(fibonacciIterative(i) + " ");
            }
        }

        sc.close();
    }
}
