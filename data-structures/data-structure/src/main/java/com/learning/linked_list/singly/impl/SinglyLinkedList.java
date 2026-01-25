package com.learning.linked_list.singly.impl;

import java.util.NoSuchElementException;
import java.util.Scanner;


public class SinglyLinkedList {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    int length = 0;
    Node head = null, tail = null;

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        while (true) {
            System.out.println();
            System.out.println("Linked List Menu");
            String options = """
                    1. addFirst
                    2. addLast
                    3. addByPosition
                    4. removeFirst
                    5. removeLast
                    6. removeByPosition
                    7. display
                    8. length
                    7. Exit
                    """;
            System.out.println(options);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the choice");
            int choice = sc.nextInt();
            System.out.println("Entered Choice :: " + choice);

            switch (choice) {
                case 1: {
                    System.out.print("Enter the item ");
                    int item = sc.nextInt();
                    System.out.println("Pushing the item to beginning " + item);
                    list.addFirst(item);
                    break;
                }
                case 2: {
                    System.out.print("Enter the item ");
                    int item = sc.nextInt();
                    System.out.println("Pushing the item to end " + item);
                    list.addLast(item);
                    break;
                }
                case 3: {
                    System.out.print("Enter the item ");
                    int item = sc.nextInt();
                    System.out.print("Enter the position ");
                    int pos = sc.nextInt();
                    System.out.println("Pushing the item = " + item + " at position = " + pos);
                    list.addByPosition(pos, item);
                    break;
                }
                case 4: {
                    int item = list.removeFirst();
                    System.out.println("Removed First Element Of List " + item);
                    break;
                }
                case 5: {
                    int item = list.removeLast();
                    System.out.println("Removed Last Element Of List " + item);
                    break;
                }
                case 6: {
                    System.out.println("Please enter the position to remove element");
                    int pos = sc.nextInt();
                    System.out.println("Removing the item to position " + pos);
                    int item = list.removeByPosition(pos);
                    System.out.println("Removed the element at position = " + pos + " is = " + item);
                    break;
                }
                case 7: {
                    System.out.println("Display the elements");
                    list.display();
                    break;
                }
                case 8: {
                    System.out.println("List Size");
                    System.out.println(list.size());
                    break;
                }
                default: {
                    System.out.println("Exiting");
                    System.exit(1);
                }
            }
        }
    }

    private int removeByPosition(int pos) {

        if (head == null || pos > size()) {
            length--;
            return removeLast();
        } else {
            if (pos == 1) {
                length--;
                return removeFirst();
            }

            if (pos == size()) {
                length--;
                return removeLast();
            }

            // Arbitrary Position
            Node prev = null;
            Node next = head;
            int count = 1;
            while (next != null) {
                prev = next;
                next = next.next;
                count++;

                if (count == pos) {
                    int data = next.data;
                    next = next.next;
                    prev.next = next;
                    length--;
                    return data;
                }
            }

            return -1;
        }
    }

    private void addByPosition(int pos, int item) {

        if (head == null || pos > size()) {
            length++;
            addLast(item);
        } else {
            if (pos == 1) {
                length++;
                addFirst(item);
                return;
            }

            if (pos == size()) {
                length++;
                addLast(item);
                return;
            }

            // Arbitrary Position
            Node newNode = new Node(item);
            Node prev = null;
            Node next = head;
            int count = 1;
            while (next != null) {
                prev = next;
                next = next.next;
                count++;

                if (count == pos) {
                    prev.next = newNode;
                    newNode.next = next;
                    length++;
                    break;
                }
            }
        }
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
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

    public void addFirst(int data) {
        Node node = new Node(data);
        length++;

        if (head == null) {
            head = tail = node;
            return;
        }

        node.next = head;
        head = node;

    }

    public void addLast(int data) {
        Node node = new Node(data);
        length++;

        if (head == null) {
            head = tail = node;
            return;
        }

        tail.next = node;
        tail = node;
    }

    public int removeFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        Node curr = head;
        head = head.next;

        // clean up current node
        curr.next = null;

        length--;
        return curr.data;
    }

    public int removeLast() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        length--;
        if (head.next == null) {
            System.out.println(head.data);
            head = tail = null;
            return -1;
        }

        Node curr = head;
        while (curr.next != tail) {
            curr = curr.next;
        }

        // clean up current node
        int value = tail.data;
        curr.next = null;
        tail = curr;


        return value;
    }
}
