package com.advanced.greedy;
import java.util.ArrayList;
import java.util.List;
public class MinimumNumberOfCoins {
    public static void findMinCoins(int[] coins, int V){
        // if the array is not sorted, sort it in the beginning
        List<Integer> result = new ArrayList<>();
        for (int i= coins.length - 1; i>=0; i--){
            while (V >= coins[i]){
                V -= coins[i];
                result.add(coins[i]); // Store that coin into the result list
            }
        }
        System.out.print("Coins Selected: " + result);
        System.out.println();
        System.out.println("Min Number of Coins: " + result.size());
    }
    public static void main(String[] args) {
        int[] coins = {1,2,5,10,20,50,100,200,500,1000,2000};
        int V1 = 91;
        int V2 = 31;
        int V3 = 10;
        findMinCoins(coins, V1);
        findMinCoins(coins, V2);
        findMinCoins(coins, V3);
    }
}
