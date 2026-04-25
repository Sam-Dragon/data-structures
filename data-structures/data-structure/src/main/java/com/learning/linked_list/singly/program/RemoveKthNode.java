package com.learning.linked_list.singly.program;

import java.util.Scanner;

public class RemoveKthNode {

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
        Node node = new Node(4);
        node.next = head;
        head = node;

        node = new Node(3);
        node.next = head;
        head = node;

        node = new Node(2);
        node.next = head;
        head = node;

        node = new Node(1);
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
    private void removeKthNode(int index) {
        if (head == null) {
            throw new RuntimeException("Empty List");
        }

        if (head.next == null) {
            System.out.println(head.data);
            return;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node slow = dummy, fast = dummy;

        for (int i = 0; i < index; i++) {
            fast = fast.next;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        head = dummy.next;
    }

    public static void main(String[] args) {
        RemoveKthNode list = new RemoveKthNode();
        list.prepare();
        list.display();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the node to remove");
        int index = sc.nextInt();
        System.out.println("Removing index = " + index);

        System.out.println("\nReverse the list");
        list.removeKthNode(index);
        list.display();
    }


}
