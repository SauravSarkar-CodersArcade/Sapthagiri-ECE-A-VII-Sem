package com.advanced.dynamicProgramming;
public class FibonacciTabulation {
    public static int fib(int n){
        if(n <= 1) return n;
        // Step 1: Create a dp array of n+1 size
        int[] dp = new int[n+1];
        // Step 2: Store the known values f(0) & f(1)
        dp[0] = 0;
        dp[1] = 1;
        // Step 3: Calculate the remaining unknown values
        for (int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println("The Fibonacci of number " + n + " is " + fib(n));
    }
}
