package com.basics.miscellaneous;
import java.util.ArrayList;
import java.util.List;
public class WildCards {
    public static void printList(List<?> list){
        for (Object o : list){
            System.out.print(o + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        printList(integerList);
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        printList(stringList);
    }
}
