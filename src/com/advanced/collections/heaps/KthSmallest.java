package com.advanced.collections.heaps;
import java.util.Collections;
import java.util.PriorityQueue;
public class KthSmallest {
    public static void kthSmallest(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : arr){
            maxHeap.add(x);
            if(maxHeap.size() > k){
                maxHeap.poll(); // Remove larger elements more than k size
            }
        }
        // Now the top/front element of the queue will be the kth smallest
        System.out.println(k + "th smallest element is: " + maxHeap.peek());
    }
    public static void main(String[] args) {
        int[] arr = {3,7,4,8,10,9};
        int k = 3;
        kthSmallest(arr, k);
    }
}
