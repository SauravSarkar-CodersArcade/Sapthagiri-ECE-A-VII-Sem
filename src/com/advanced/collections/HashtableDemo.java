package com.advanced.collections;
import java.util.Hashtable;
import java.util.Map;
public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Anjali");
        ht.put(117, "Chitra");
        ht.put(128, "Ayesha");
        ht.put(100, "Tushar");
        ht.put(102, "Amit");
        ht.put(99, "Anand");
        for (Map.Entry<Integer, String> entry : ht.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
