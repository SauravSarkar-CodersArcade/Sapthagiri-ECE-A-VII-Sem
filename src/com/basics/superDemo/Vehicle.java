package com.basics.superDemo;
public class Vehicle {
    Vehicle(){
        System.out.println("Vehicle Constructor");
    }
}
class Car extends Vehicle{
    Car(){
        super();
        System.out.println("Car Constructor");
    }
}
class Testing {
    public static void main(String[] args) {
        Car car = new Car();
    }
}