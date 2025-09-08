package com.advanced.dynamicProgramming;
public class FibonacciRecursion {
    public static int fib(int n){
        if (n <= 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("The Fibonacci of number " + n + " is " + fib(n));
    }
}
