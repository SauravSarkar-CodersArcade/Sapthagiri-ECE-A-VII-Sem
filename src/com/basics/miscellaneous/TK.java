package com.basics.miscellaneous;

import java.util.HashSet;

public class TK {
    int parameter;
    void change(int parameter){
        this.parameter = parameter; // Confusion
    }
    void display(){
        System.out.println("The instance variable value is: " + parameter);
    }
    public static void main(String[] args) {
        TK instance = new TK();
        instance.change(10);
        instance.display();
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add("Java");
        System.out.println(hashSet);
    }
}
