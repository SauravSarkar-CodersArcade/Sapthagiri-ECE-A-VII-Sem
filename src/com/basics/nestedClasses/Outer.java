package com.basics.nestedClasses;
public class Outer {
    private int x = 20;
    class Inner {
        void display(){
            System.out.println("The value of x is: " + x);
        }
    }
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.x);
        // OuterClass.InnerClass in_obj = out_obj.new InnerClass();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
