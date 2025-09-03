package com.basics.abstraction;
abstract class Animal {
    // If the class has only abstract methods its 100%
    // If it has even one normal method it is not 100%
    // Complete or normal or concrete methods
    void eat(){
        System.out.println("Animal eats some food.");
    }
    // abstract method
    abstract void run();
}
interface A {
    // Interface always has methods with empty bodies, so it is always 100%
    void eat();
    void show();
}
