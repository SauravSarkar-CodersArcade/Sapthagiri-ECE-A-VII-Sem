package com.advanced.algos;

import java.util.Arrays;

public class CountSortAlgo {
    public static void countSort(int[] arr){
        // Find the max
        int k = arr[0]; // Let's assume first element is the max
        for (int i=1; i< arr.length; i++){
            if(arr[i] > k){
                k = arr[i];
            }
        }
        // Create a count array of index (0 to max)
        int[] count = new int[k+1];
        // Calculate the frequency of each element in the array
        for (int i=0; i< arr.length; i++){
            count[arr[i]]++;
        }
        // Calculate the cumulative frequency count
        // Skip index 0, because there's no previous of 0
        for (int i=1; i<=k; i++){
            // curr = curr + prev
            count[i] += count[i-1];
        }
        // Create the output array
        int[] output = new int[arr.length];
        // Start from the end of the array
        for (int i= arr.length-1; i >= 0; i--){
            output[--count[arr[i]]] = arr[i];
        }
        // Traditional way to copy one array into another
//        for (int i=0; i< arr.length; i++){
//            arr[i] = output[i];
//        }
        System.arraycopy(output, 0, arr, 0, arr.length);
    }
    public static void main(String[] args) {
        int[] arr = {3,4,6,1,4,3,2,3,1};
        System.out.println("Before: " + Arrays.toString(arr));
        countSort(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
}
