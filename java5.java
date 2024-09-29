/*Write a Java program to print all numbers below 100,000 that are both prime and Fibonacci number
(some examples are 2, 3, 5, 13, etc.).*/

import java.util.ArrayList;

public class PrimeFibonacci {
    public static void main(String[] args) {
        int limit = 100000;
        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
        int a = 0;
        int b = 1;

        // Generate Fibonacci numbers up to the limit
        while (a <= limit) {
            fibonacciNumbers.add(a);
            int next = a + b;
            a = b;
            b = next;
        }

        // Print Fibonacci numbers that are also prime
        System.out.println("Prime Fibonacci numbers below " + limit + ":");
        for (int num : fibonacciNumbers) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        if (n <= 3) return true;  // 2 and 3 are prime
        if (n % 2 == 0 || n % 3 == 0) return false; // Exclude multiples of 2 and 3

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}