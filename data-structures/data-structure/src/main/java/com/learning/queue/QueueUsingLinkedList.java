package com.learning.queue;

import java.util.Scanner;

class Node {
    int item;
    Node next;

    public Node(int item) {
        this.item = item;
        this.next = null;
    }
}

class StackLinkedList {
    Node head = null, tail = null;
    int length = 0;

    public void enqueue(int item) {
        Node newNode = new Node(item);

        if (tail != null) {
            tail.next = newNode;
            tail = newNode;
        } else {
            tail = newNode;
            head = tail;
        }
        length++;
    }

    public void display() {
        if (head == null) {
            System.out.println("Queue is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.item);
            temp = temp.next;
        }
    }

    public int deque() {
        if (head == null) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int item = head.item;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return item;
    }

    public int peek() {
        if (head == null) {
            System.out.println("Queue Empty");
            return -1;
        }

        return head.item;
    }
}

public class QueueUsingLinkedList {

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        while (true) {
            System.out.println();
            System.out.println("Stack Menu");
            String options = """
                    1. Enqueue
                    2. Peek
                    3. Deque
                    4. Display
                    5. Exit
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
                    System.out.println("Pushing the item " + item);
                    stack.enqueue(item);
                    break;
                }
                case 2: {
                    int item = stack.peek();
                    System.out.println("Top of the Stack " + item);
                    break;
                }
                case 3: {
                    int item = stack.deque();
                    System.out.println("Popping the item " + item);
                    break;
                }
                case 4: {
                    System.out.println("Display the elements");
                    stack.display();
                    System.out.println();
                    break;
                }
                default:
                    System.out.println("Exiting");
                    System.exit(1);
            }
        }

    }
}
