package com.advanced.dataStructures.linear.linkedLists.problems.cycleDetect;
class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class CycleDetection {
    public static boolean isCyclic(Node head){
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next; // 1 step
            fast = fast.next.next; // 2 steps
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = head1.next;  // 4->next = 2; Cycle
        System.out.println(isCyclic(head1) ? "Cyclic" : "Not Cyclic.");
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5); // 1->2->3->4->5->null;
        System.out.println(isCyclic(head2) ? "Cyclic" : "Not Cyclic.");
    }
}
