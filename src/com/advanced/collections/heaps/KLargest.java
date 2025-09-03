package com.advanced.collections.heaps;
import java.util.PriorityQueue;
public class KLargest {
    public static void kLargest(int[] arr, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int x : arr){
            minHeap.add(x);
            if(minHeap.size() > k){
                minHeap.poll(); // If size exceeds k, remove smaller elements
            }
        }
        // Display the remaining k-largest elements
        System.out.print("The " + k + " largest elements are: ");
        while (!minHeap.isEmpty()){
            System.out.print(minHeap.poll() + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        kLargest(arr, 3);
    }
}
