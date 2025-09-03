package com.basics.polymorphism;
public class Overloading { //1. No of parameters, 2. Change the type of parameters
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    static void add(float a, float b){
        System.out.println("Float Called");
        System.out.println(a+b);
    }
    static void add(double a, double b){
        System.out.println("Double Called");
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        add(1,2);
        add(1,2,3);
        add(2.5f,3.5f);
        add(3.456, 4.567);
    }
}
