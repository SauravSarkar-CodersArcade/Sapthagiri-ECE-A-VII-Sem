package com.advanced.collections;
class Test<T> {
    T value;
    Test(T value){
        this.value = value;
    }
    void show(){
        System.out.println("Value: " + value);
    }
}
public class Generics {
    public static void main(String[] args) {
        Test<Integer> ti = new Test<>(1);
        ti.show();
        Test<String> ts = new Test<>("Java");
        ts.show();
    }
}
