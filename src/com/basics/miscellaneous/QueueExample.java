package com.basics.miscellaneous;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.offer(10);
        queue.offer(20);
        System.out.println(queue.poll());
        queue.add(30);
        queue.remove();
    }
}
