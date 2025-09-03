package com.basics.exceptions;
public class E3 { // Selenium - Framework - Web Based Applications
    public static void main(String[] args) {
        try {
            // If you want to forcefully create an exception, we use the Throwable Class
            throw new Throwable("This is a custom Throwable Exception");
        }catch (Throwable t){
            System.out.println("Caught Throwable");
            System.out.println("Message: " + t.getMessage());
            System.out.println("Class: " + t.getClass().getName());
            System.out.println("Stack Trace: ");
            t.printStackTrace();
        }
    }
}
