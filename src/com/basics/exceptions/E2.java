package com.basics.exceptions;

public class E2 {
    // The throw keyword is used to create User Defined Exceptions or Custom Exceptions
    static void checkAge(int age){
        if (age >= 18){
            System.out.println("Eligible -> Access Granted");
        }else {
            throw new RuntimeException("Not Eligible -> Access Denied..!!");
        }
    }
    public static void main(String[] args) {
        checkAge(12);
    }
}
