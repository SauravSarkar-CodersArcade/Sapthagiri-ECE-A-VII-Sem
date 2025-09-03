package com.basics.superDemo;
public class Parent {
    String name = "Parent";
}
class Child extends Parent {
    String name = "Child";

    void showName(){
        System.out.println(name); // Child
        System.out.println(super.name);
    }
    public static void main(String[] args) {
        Child child = new Child();
        child.showName();
    }
}
