package com.bridgelabz.linkedlist;

public class LinkedList {
    // A simple Java program for traversal of a linked list
    Node head; // head of list

    /* Linked list Node. This inner class is made static so that
    main() can access it */
    static class Node {
        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        } // Constructor
    }

    /* This function prints contents of linked list starting from head */
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    /* method to create a simple linked list with 3 nodes*/
    public static void main(String[] args) {
        /* Start with the empty list. */
        LinkedList llist = new LinkedList();

        llist.head = new Node(56);
        Node second = new Node(30);
        Node third = new Node(70);

        llist.head.next = second; // Link first node with the second node
        second.next = third; // Link second node with the third node

        llist.printList();
    }

}
