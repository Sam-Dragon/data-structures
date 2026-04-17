package com.learning.linked_list.doubly.program;

public class ListToArrayFromHead {

    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public Node(int data) {
            this(data, null, null);
        }

        public String toString() {
            return left + "<- [" + data + "] ->" + right;
        }
    }

    Node head = null, tail = null;

    public void add(Node node) {
        if (head == null) {
            head = tail = node;
            return;
        }

        Node curr = head;
        while (curr.right != null) {
            curr = curr.right;
        }

        curr.right = node;
        node.left = curr;
    }

    public void display() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.right;
        }
        System.out.println();
    }

    public void readFromBeginning(Node node) {
        System.out.println("Random Node Provided = " + node.data);

        Node temp = node;
        while (temp.left != null) {
            temp = temp.left;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.right;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListToArrayFromHead obj = new ListToArrayFromHead();

        Node node1 = new Node(10);
        obj.add(node1);

        Node node2 = new Node(20);
        obj.add(node2);

        Node node3 = new Node(30);
        obj.add(node3);

        Node node4 = new Node(40);
        obj.add(node4);

        System.out.println("Original List");
        obj.display();

        System.out.println("Traversing from Node 3");
        obj.readFromBeginning(node3);

        System.out.println("Traversing from Node 2");
        obj.readFromBeginning(node2);
    }
}
