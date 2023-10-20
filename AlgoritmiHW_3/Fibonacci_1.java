public class Fibonacci_1 {
    static long fibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    static long fibonacciIteration(int x) {
        if (x <= 1) {
            return x;
        }
        long fib1 = 0;
        long fib2 = 1;
        long result = 0;

        for (int i = 2; i <= x; i++) {
            result = fib1 + fib2;
            fib1 = fib2;
            fib2 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] numbersToCalculate = {10, 20, 30};

        for (int n : numbersToCalculate) {
            long fibonacciRecursionValue = fibonacciRecursion(n);
            long fibonacciIterationValue = fibonacciIteration(n);
            System.out.println("Число Фибоначчи для n = " + n + " (рекурсия): " + fibonacciRecursionValue);
            System.out.println("Число Фибоначчи для n = " + n + " (итерация): " + fibonacciIterationValue);
        }
    }
}
