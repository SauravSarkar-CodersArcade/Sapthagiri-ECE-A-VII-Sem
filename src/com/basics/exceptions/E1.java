package com.basics.exceptions;
public class E1 {
    public static void main(String[] args) {
        int i;
        int j;
        int k = 0;
        i = 10;
        j = 5;
        try {
            k = i / j;
            int[] arr = {1,2,3};
            System.out.println(arr[10]);
        }catch (ArithmeticException e){
            System.out.println("Can't divide by 0");
            e.printStackTrace(); // Get details of the exception
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Array Index");
        }catch (Exception e){
            System.out.println("Something unexpected happened...!!!");
        }finally {
            System.out.println("End of execution");
        }
        System.out.println("The value of k is: " + k);
    }
}
