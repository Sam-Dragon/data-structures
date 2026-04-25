package com.learning.linked_list.singly.program;

public class ListMerge {
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


    private Node zip(Node headNode1, Node headNode2) {
        Node dummy = new Node(0);
        Node dummyHead = dummy;

        while (headNode1 != null | headNode2 != null) {
            if (headNode1 != null) {
                dummyHead.next = new Node(headNode1.data);
                headNode1 = headNode1.next;
                dummyHead = dummyHead.next;
            }

            if (headNode2 != null) {
                dummyHead.next = new Node(headNode2.data);
                headNode2 = headNode2.next;
                dummyHead = dummyHead.next;
            }
        }

        return dummy;
    }

    public static void main(String[] args) {
        ListMerge list = new ListMerge();

        Node node1 = new Node(5);
        list.addFirst(node1);

        Node node2 = new Node(3);
        list.addFirst(node2);

        Node node3 = new Node(1);
        list.addFirst(node3);

        list.display(node3);

        ListMerge list2 = new ListMerge();

        Node node12 = new Node(6);
        list2.addFirst(node12);

        Node node22 = new Node(4);
        list2.addFirst(node22);

        Node node32 = new Node(2);
        list2.addFirst(node32);

        list2.display(node32);

        Node resultNode = list.zip(node3, node32);
        list.display(resultNode);
    }


}
