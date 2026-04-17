package com.learning.linked_list.singly.program;

public class ListReversal {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null, tail = null;

    private void prepare() {
        Node node = new Node(40);
        node.next = head;
        head = node;

        node = new Node(30);
        node.next = head;
        head = node;

        node = new Node(20);
        node.next = head;
        head = node;

        node = new Node(10);
        node.next = head;
        head = node;
    }

    private void display() {
        if (head == null) {
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println();
    }

    // REVERSE THE LIST
    private void reverse() {
        if (head == null) {
            throw new RuntimeException("Empty List");
        }

        if (head.next == null) {
            System.out.println(head.data);
            return;
        }

        Node prev = null, curr = head;
        while (curr != null) {
            // Holding Current Pointer Reference
            Node currNext = curr.next;

            curr.next = prev;
            prev = curr;
            curr = currNext;
        }

        head = prev;
    }

    public static void main(String[] args) {
        ListReversal list = new ListReversal();
        list.prepare();
        list.display();

        System.out.println("\nReverse the list");
        list.reverse();
        list.display();
    }


}
