package com.learning.linked_list.singly.program;

public class ListCopy {

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

    public void display(Node head) {
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


    private Node copy(Node headNode) {
        Node dummy = new Node(0);
        Node cur = dummy;

        while (headNode != null) {
            cur.next = headNode;
            headNode = headNode.next;
            cur = cur.next;
        }

        return dummy;
    }

    public static void main(String[] args) {
        ListCopy list = new ListCopy();

        Node node1 = new Node(10);
        list.addFirst(node1);

        Node node2 = new Node(20);
        list.addFirst(node2);

        Node node3 = new Node(30);
        list.addFirst(node3);

        Node node4 = new Node(40);
        list.addFirst(node4);

        list.display(node4);

        Node resultNode = list.copy(node4);

        list.display(resultNode);
    }

}
