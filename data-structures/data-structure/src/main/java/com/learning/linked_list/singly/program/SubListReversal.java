package com.learning.linked_list.singly.program;

import java.util.Scanner;

import static java.util.Collections.swap;

public class SubListReversal {

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
        Node node = new Node(15);
        node.next = head;
        head = node;

        node = new Node(14);
        node.next = head;
        head = node;

        node = new Node(13);
        node.next = head;
        head = node;

        node = new Node(12);
        node.next = head;
        head = node;

        node = new Node(11);
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
    private void reverse(int begin, int end) {
        if (head == null) {
            throw new RuntimeException("Empty List");
        }

        if (head.next == null) {
            System.out.println(head.data);
            return;
        }

        Node firstNode = head;
        int count = 0;

        Node dummy = new Node(0);
        Node finalDummy = dummy;

        while (firstNode != null && count != begin) {
            finalDummy.next = new Node(firstNode.data);
            finalDummy = finalDummy.next;
            count++;

            firstNode = firstNode.next;
        }

        // Swap the sublist
        Node prev = null, curr = firstNode;
        int diff = end - begin;
        while (curr != null && diff >= 0) {
            // Holding Current Pointer Reference
            Node currNext = curr.next;

            curr.next = prev;
            prev = curr;
            curr = currNext;
            diff--;
        }

        finalDummy.next = prev;

        head = dummy;
    }

    public static void main(String[] args) {
        SubListReversal list = new SubListReversal();
        list.prepare();
        list.display();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the begin and ending index");
        String input = sc.nextLine();
        String[] arr = input.split(",");
        int begin = Integer.parseInt(arr[0]);
        int end = Integer.parseInt(arr[1]);

        System.out.println("\nReverse the list");
        list.reverse(begin, end);
        list.display();
    }

}
