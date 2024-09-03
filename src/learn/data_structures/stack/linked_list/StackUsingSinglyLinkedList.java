package learn.data_structures.stack.linked_list;

import learn.util.Node;

import java.util.Scanner;

public class StackUsingSinglyLinkedList {
    Node head;

    public static void main(String[] args) {
        StackUsingSinglyLinkedList stack = new StackUsingSinglyLinkedList();

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

    private boolean isEmpty() {
        return head == null;
    }

    private void push(int element) {
        Node newNode = new Node(element);

        if (head != null)
            newNode.setNext(head);

        head = newNode;
    }

    private void pop() {
        if (isEmpty()) {
            System.out.println("Stack is underflow");
            return;
        }

        System.out.println("Element Removed :: " + head.getValue());
        head = head.getNext();
    }

    private void peek() {
        if (isEmpty()) {
            System.out.println("Stack is underflow");
            return;
        }

        System.out.println("Top Element :: " + head.getValue());
    }

    private void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        var currentNode = head;
        System.out.print("Content :: ");
        while (currentNode != null) {
            System.out.print(currentNode.getValue() + " ");
            currentNode = currentNode.getNext();
        }
    }
}

