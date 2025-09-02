package com.basics;
public class RightAngledTriangle {
    public static void main(String[] args) {
        int n = 5;
        for (int r = 1; r <= n; r++){
            for (int c = 1; c <= r; c++){
                System.out.print(" * ");
            }
            System.out.println();
        }


    }
}
