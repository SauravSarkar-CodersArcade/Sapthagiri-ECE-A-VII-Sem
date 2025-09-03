package com.basics.encapsulation;
public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Sanjay");
        e.setEmail("sanjay@gmail.com");
        System.out.println(e.getName());
        System.out.println(e.getEmail());
    }
}
