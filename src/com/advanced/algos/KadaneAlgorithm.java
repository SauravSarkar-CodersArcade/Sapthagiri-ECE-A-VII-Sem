package com.advanced.algos;
public class KadaneAlgorithm {
    static int kadaneAlgo(int[] arr){
        int cMax = arr[0];
        int gMax = arr[0];
        for (int i=1; i<arr.length; i++){
            cMax = Math.max(arr[i], cMax + arr[i]);
            gMax = Math.max(cMax, gMax);
        }
        return gMax;
    }
    public static void main(String[] args) {
        int[] arr = {5,-8,1,2,-1,4};
        int[] array = {-1,-2,-3,-4,-5,-6,0};
        System.out.println("Max Sub-array sum: " + kadaneAlgo(arr));
        System.out.println("Max Sub-array sum: " + kadaneAlgo(array));

    }
}
