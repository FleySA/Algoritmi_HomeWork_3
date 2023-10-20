public class Fibonacci {
    static double fibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
    static double fibonacciIteration(int x) {
        if (x<=1){
        return x;
    }
        int fib1 = 0;
        int fib2 = 1;
        int result = 0;

        for (int i = 2; i<=x; i++){
            result = fib1+fib2;
            fib1 = fib2;
            fib2 = result;
        }
        return result;
        }

    public static void main(String[] args) {
        int n = 20;
        double fibonacciValue = fibonacciRecursion(n);
        System.out.println(" Число Фибоначчи для n = " + n + " (рекурсия): " + fibonacciValue);

        int x = 20; // Искомое число Фибоначчи
        double fibonacciValue1 = fibonacciIteration(x);
        System.out.println("Число Фибоначчи для n=" + n + " (итерация): " + fibonacciValue1);
    }
}
