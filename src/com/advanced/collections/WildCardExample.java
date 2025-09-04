package com.advanced.collections;
import java.util.ArrayList;
import java.util.List;
public class WildCardExample {
    public static void printList(List<?> list){
        for (Object o : list){
            System.out.print(o + " ");
        }
    }
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Python");
        printList(strings);
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        printList(integers);
    }
}
