package com.basics.miscellaneous;
public class Demo {
    {
        System.out.println("IIB - Instance Initializer Block - 2");
    }
    final int x;
    static final int y;
    public Demo() {
        x = 20;
    }
    static {
        y = 20; //
        System.out.println("Start app"); // All stuff are loaded here
    }
    public static void main(String[] args) {

        System.out.println("Sapthagiri College");
        new Demo();
    }
    {
        System.out.println("IIB - Instance Initializer Block - 1");
    }
}

