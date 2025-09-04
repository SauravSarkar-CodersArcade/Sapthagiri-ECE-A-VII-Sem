package com.advanced.greedy;
import java.util.Arrays;
public class MinimumPlatforms {
    public static int minPlatforms(int[] arr, int[] dep){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = arr.length;
        int platformsNeeded = 0, maxPlatforms = 0;
        int i = 0, j = 0;
        while (i < n && j < n){
            if(arr[i] <= dep[j]){
                platformsNeeded++;
                i++;
            }else {
                platformsNeeded--;
                j++;
            }
            maxPlatforms = Math.max(platformsNeeded, maxPlatforms);
        }
        return maxPlatforms;
    }
    public static void main(String[] args) {
        // int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        // int[] departure = {910, 1200, 1120, 1130, 1900, 2000};
        int[] arrival = {900, 940, 950};
        int[]departure = {1200, 910, 1120};
        System.out.println(minPlatforms(arrival, departure));
    }
}
