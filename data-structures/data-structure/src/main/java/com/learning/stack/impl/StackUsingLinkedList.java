package com.learning.stack.impl;

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

    Node head = null;

    public void push(int item) {
        Node newNode = new Node(item);

        if (head != null) {
            newNode.next = head;
        }

        head = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("Stack is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.item);
            temp = temp.next;
        }
    }

    public int pop() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int item = head.item;
        head = head.next;

        return item;
    }

    public int peek() {
        if (head == null) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return head.item;
    }
}

public class StackUsingLinkedList {

    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        while (true) {
            System.out.println();
            System.out.println("Stack Menu");
            String options = """
                    1. Push
                    2. Peek
                    3. Pop
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
                    stack.push(item);
                    break;
                }
                case 2: {
                    int item = stack.peek();
                    System.out.println("Top of the Stack " + item);
                    break;
                }
                case 3: {
                    int item = stack.pop();
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
