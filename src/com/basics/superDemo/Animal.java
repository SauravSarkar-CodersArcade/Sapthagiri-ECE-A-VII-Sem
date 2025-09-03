package com.basics.superDemo;
public class Animal {
    void sound(){
        System.out.println("Animal makes some sound..!!");
    }
}
class Dog extends Animal {
    void sound(){
        System.out.println("Dog Barks..!!");
    }
    void callParentSound(){
        super.sound();
    }
}
class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.callParentSound();
    }
}