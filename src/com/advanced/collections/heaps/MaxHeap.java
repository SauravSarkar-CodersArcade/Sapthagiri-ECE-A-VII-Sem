package com.advanced.collections.heaps;
import java.util.Collections;
import java.util.PriorityQueue;
public class MaxHeap {
    public static void main(String[] args) {
        // A PQ is a min heap by default
        // We use the reverseOrder() for Max Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>
                (Collections.reverseOrder());
        maxHeap.add(20);
        maxHeap.add(100);
        maxHeap.add(2);
        maxHeap.add(21);
        System.out.println(maxHeap);
        System.out.println(maxHeap.poll());
    }
}
