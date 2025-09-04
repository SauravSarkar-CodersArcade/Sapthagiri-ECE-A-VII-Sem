package com.advanced.greedy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public static int findMinDiff(ArrayList<Integer> arr, int m) {
        // If students are zero or array has fewer elements than students, we can't find answer
        if( m == 0 || arr.size() < m){
            return 0;
        }
        Collections.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        // Sliding Window
        for (int i=0; i+m-1 < arr.size(); i++){
            int diff = arr.get(i+m-1) - arr.get(i);
            minDiff = Math.min(diff, minDiff);
        }
        return minDiff;
    }
    public static void main(String[] args) {
        ArrayList<Integer> chocolates = new ArrayList<>(
                Arrays.asList(7,3,2,4,9,12,56)
        );
        System.out.println("Minimum Difference: " + findMinDiff(chocolates, 3)
                );

    }
}
