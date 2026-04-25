package com.learning.linked_list.singly.program;

public class ListMergeSorted {
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


    private Node merge(Node headNode1, Node headNode2) {
        Node dummy = new Node(0);
        Node dummyHead = dummy;

        while (headNode1 != null && headNode2 != null) {
            if (headNode1.data < headNode2.data) {
                dummyHead.next = new Node(headNode1.data);
                headNode1 = headNode1.next;
            } else {
                dummyHead.next = new Node(headNode2.data);
                headNode2 = headNode2.next;
            }
            dummyHead = dummyHead.next;
        }

        while (headNode1 != null) {
            dummyHead.next = new Node(headNode1.data);
            headNode1 = headNode1.next;
            dummyHead = dummyHead.next;
        }

        while (headNode2 != null) {
            dummyHead.next = new Node(headNode2.data);
            headNode2 = headNode2.next;
            dummyHead = dummyHead.next;
        }

        return dummy;
    }

    public static void main(String[] args) {
        ListMergeSorted list = new ListMergeSorted();

        /*Node node0 = new Node(7);
        list.addFirst(node0);*/

        Node node1 = new Node(5);
        list.addFirst(node1);

        Node node2 = new Node(3);
        list.addFirst(node2);

        Node node3 = new Node(1);
        list.addFirst(node3);

        list.display(node3);

        ListMergeSorted list2 = new ListMergeSorted();

       /* Node node11 = new Node(7);
        list2.addFirst(node11);*/

        Node node12 = new Node(6);
        list2.addFirst(node12);

        Node node22 = new Node(2);
        list2.addFirst(node22);

        Node node32 = new Node(1);
        list2.addFirst(node32);

        list2.display(node32);

        Node resultNode = list.merge(node3, node32);
        list.display(resultNode);
    }


}
