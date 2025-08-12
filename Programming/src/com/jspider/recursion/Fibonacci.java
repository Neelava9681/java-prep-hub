package com.jspider.recursion;

public class Fibonacci {
    static int fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid input");
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci series up to 10 terms:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
