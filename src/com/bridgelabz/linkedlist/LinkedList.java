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

    public  void addingValuesFromFirst(int key){
        Node newNode = new Node(key);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
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

        llist.addingValuesFromFirst(70);
        llist.addingValuesFromFirst(30);
        llist.addingValuesFromFirst(56);
        llist.printList();
    }

}
