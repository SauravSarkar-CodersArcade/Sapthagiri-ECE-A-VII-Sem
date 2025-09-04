package com.basics.miscellaneous;
public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2};
        int result = 0;
        for (int i=0; i< arr.length; i++){
            result = result ^ arr[i];
        }
        System.out.println("The non-repeating element is: "
        + result);
        System.out.println(7 & -7);
    }
}
