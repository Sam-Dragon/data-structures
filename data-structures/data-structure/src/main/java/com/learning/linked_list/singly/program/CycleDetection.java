package com.learning.linked_list.singly.program;

public class CycleDetection {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        @Override
        public String toString() {
            return data + " -> " + next;
        }
    }

    Node head = null, tail = null;

    public Node addFirst(Node node) {
        if (head == null) {
            head = tail = node;
            return node;
        }

        node.next = head;
        head = node;

        return node;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        Node headNode = head;
        if (headNode.next == null) {
            System.out.println(headNode.data);
        } else {
            while (headNode != null) {
                System.out.print(headNode.data + " ");
                headNode = headNode.next;
            }
            System.out.println();
        }
    }

    private boolean isCyclic(Node headNode) {
        Node first = headNode, last = headNode;
        while (last != null && last.next != null) {
            first = first.next;
            last = last.next.next;

            if (first == last)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        CycleDetection list = new CycleDetection();

        Node node1 = new Node(10);
        list.addFirst(node1);

        Node node2 = new Node(20);
        list.addFirst(node2);

        Node node3 = new Node(30);
        list.addFirst(node3);

        Node node4 = new Node(40);
        list.addFirst(node4);

        Node node5 = new Node(50);
        list.addFirst(node5);
        System.out.println(node5);

//        node1.next = node5;
//        list.display();
        boolean result = list.isCyclic(node1);
        System.out.println("Is Cyclic = " + result);
    }
}
