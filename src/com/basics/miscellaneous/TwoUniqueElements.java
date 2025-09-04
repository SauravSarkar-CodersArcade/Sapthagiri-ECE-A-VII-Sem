package com.basics.miscellaneous;
public class TwoUniqueElements {
    static void twoUniqueElements(int[] arr){
        int xorAll = 0;
        int n1 = 0, n2 = 0;
        for (int i=0; i<arr.length; i++){
            xorAll ^= arr[i];
        }
        int rsb = xorAll & -xorAll;
        for (int i=0; i<arr.length; i++){
            if((arr[i] & rsb) != 0){
                n1 ^= arr[i];
            }else {
                n2 ^= arr[i];
            }
        }
        System.out.println("n1 = " + n1 + ", n2 = " + n2);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,6,4,2,1};
        twoUniqueElements(arr);
    }
}
