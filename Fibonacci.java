public class Fibonacci {
    public static int fibonacci(int n) {
        // Base Cases: Fib(0) = 0, Fib(1) = 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Recursive case: Fib(n) = Fib(n-1) + Fib(n-2)
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Calculate the 10th Fibonacci number
        int result = fibonacci(n);
        System.out.println("The " + n + " the Fibonacci number is " + result);
    }
}
