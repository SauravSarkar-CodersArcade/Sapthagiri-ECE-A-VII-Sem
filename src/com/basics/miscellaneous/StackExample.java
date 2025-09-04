package com.basics.miscellaneous;
import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(10);
        integerStack.push(20);
        System.out.println(integerStack);
        System.out.println(integerStack.peek());
    }
}
