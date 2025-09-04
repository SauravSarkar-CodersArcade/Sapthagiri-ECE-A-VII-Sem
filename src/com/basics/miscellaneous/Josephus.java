package com.basics.miscellaneous;
public class Josephus {
    public static int solve(int n, int k){
        if( n == 1){
            return 0;
        }
        return (solve(n-1, k) + k) % n;
    }
    public static int josephus(int n, int k){
        int winner = solve(n, k) + 1; // 1 - modulo
        return winner;
    }
    public static void main(String[] args) {
        System.out.println(josephus(6,2));
    }
}
