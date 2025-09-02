package com.advanced.dataStructures.linear.linkedLists;
class LL{
    Node head;
    private int size;
    public class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null; // Initially each node is connected to null
            size++; // Increment the size as you create a new node
        }
    }
    public void printListElements(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // Insert Operations
    public void addFirst(String data){
        // Create a new node
        Node newNode = new Node(data);
        // Point the new node next pointer to the head
        newNode.next = head;
        // Make the new node the head of the linked list
        head = newNode;
    }
    public void addLast(String data){
        // Create a new node
        Node newNode = new Node(data);
        // Empty List - no nodes
        if(head == null){
            head = newNode;
            return;
        }
        // Find the last node
        Node last = head;
        while (last.next != null){
            last = last.next;
        }
        // Add the new node at the end of last node
        last.next = newNode;
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("Can't delete the head. List is empty.");
            return;
        }
        // For multiple nodes or single node, move head to next node
        head = this.head.next;
        size--; // Decrement the size
    }
    public void removeLast(){
        if(head == null){
            System.out.println("Can't delete last node. List is empty.");
            return;
        }
        // Single element
        if(head.next == null){
            head = null;
            return;
        }
        // Multiple elements
        Node curr = head;
        Node last = head.next;
        while (last.next != null){
            curr = last;
            last = last.next;
        }
        curr.next = null;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("DSA");
        list.addFirst("learning");
        list.addFirst("are");
        list.addFirst("We");
        list.printListElements();
        list.addLast("in");
        list.addLast("Java");
        list.printListElements();
        list.removeFirst();
        list.printListElements();
        list.removeLast();
        list.printListElements();
    }
}

