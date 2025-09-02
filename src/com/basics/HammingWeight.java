package com.basics;
public class HammingWeight {
    public static int hammingWeight(int n){
        int count = 0;
        while (n > 0){
            if( (n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(5));
        System.out.println(hammingWeight(13));
        System.out.println(hammingWeight(15));
    }
}
