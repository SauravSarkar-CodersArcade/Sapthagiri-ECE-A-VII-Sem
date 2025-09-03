package com.advanced.collections.heaps;
import java.util.PriorityQueue;
public class MinHeap {
    public static void main(String[] args) {
        // A PQ is a min heap by default
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(20);
        minHeap.add(100);
        minHeap.add(2);
        minHeap.add(21);
        System.out.println(minHeap);
        System.out.println(minHeap.poll());
    }
}
