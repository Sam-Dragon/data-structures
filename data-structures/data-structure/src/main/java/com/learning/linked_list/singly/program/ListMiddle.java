package com.learning.linked_list.singly.program;

import java.util.Scanner;

public class ListMiddle {

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
        Node node;

       /* node = new Node(50);
        node.next = head;
        head = node;*/

        node = new Node(40);
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
    private int middle() {
        if (head == null) {
            throw new RuntimeException("Empty List");
        }

        if (head.next == null) {
            System.out.println(head.data);
            return head.data;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node slow = dummy, fast = dummy;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        /*slow.next = slow.next.next;
        head = dummy.next;*/

        head = dummy.next;
        return slow.data;
    }

    public static void main(String[] args) {
        ListMiddle list = new ListMiddle();
        list.prepare();
        list.display();

        int middle = list.middle();
        System.out.println("Middle = " + middle);
    }

}
