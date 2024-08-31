package learn.stack.linked_list;

import java.util.Scanner;

public class StackUsingLinkedList {
    Node head;

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();

        stack.process();
    }

    private void process() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPlease select the operation to perform");
        while (true) {
            String operation = """
                1. Insert
                2. Peek
                3. Delete
                4. Display
                """;
            System.out.println(operation);

            System.out.println("Enter the operation to perform");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the element to insert");

                    int element = sc.nextInt();
                    System.out.println("Inserting element :: " + element);

                    push(element);
                }

                case 2 -> peek();
                case 3 -> pop();
                case 4 -> display();
                default -> System.exit(1);
            }
            System.out.println();
        }
    }

    private void push(int element) {
        Node newNode = new Node(element);

        if (head != null)
            newNode.next = head;

        head = newNode;
    }

    private void pop() {
        if (head == null) {
            System.out.println("Stack is underflow");
            return;
        }

        System.out.println("Element Removed :: " + head.value);
        head = head.next;
    }

    private void peek() {
        if (head == null) {
            System.out.println("Stack is underflow");
            return;
        }

        System.out.println("Top Element :: " + head.value);
    }

    private void display() {
        var currentNode = head;

        if (currentNode == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Content :: ");
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
    }
}

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}