package com.advanced.dynamicProgramming;
import java.util.Arrays;
public class FibonacciMemoization {
    public static int fib(int n, int[] dp){
        if(n <= 1) return n;
        // Step 2: If you have the value, don't calculate it again, just return
        if(dp[n] != -1){
            return dp[n];
        }
        // Step 3: If you don't have the value, calculate it
        return dp[n] = fib(n-1, dp) + fib(n-2, dp);

    }
    public static void main(String[] args) {
        int n = 6;
        // Step: 1 Create a dp array of size (n+1) and fill it with all (-1) values
        int[] dp = new int[n+1]; // 0-based indexing
        Arrays.fill(dp, -1); // Fill with default values (-1)
        System.out.println("The Fibonacci of number " + n + " is " + fib(n, dp));

    }
}
