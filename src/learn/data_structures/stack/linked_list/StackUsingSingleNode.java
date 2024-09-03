package learn.data_structures.stack.linked_list;

import learn.util.Node;

import java.util.Scanner;

public class StackUsingSingleNode {
    Node head;

    public static void main(String[] args) {
        StackUsingSingleNode stack = new StackUsingSingleNode();

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
            newNode.setNext(head);

        head = newNode;
    }

    private void pop() {
        if (head == null) {
            System.out.println("Stack is underflow");
            return;
        }

        System.out.println("Element Removed :: " + head.getValue());
        head = head.getNext();
    }

    private void peek() {
        if (head == null) {
            System.out.println("Stack is underflow");
            return;
        }

        System.out.println("Top Element :: " + head.getValue());
    }

    private void display() {
        var currentNode = head;

        if (currentNode == null) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Content :: ");
        while (currentNode != null) {
            System.out.print(currentNode.getValue() + " ");
            currentNode = currentNode.getNext();
        }
    }
}

