package com.learning.queue;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStacks {

    Stack<Integer> requestStack = new Stack<>();
    Stack<Integer> responseStack = new Stack<>();

    public void enqueue(int item) {
        requestStack.push(item);
    }

    public int deque() {
        if (responseStack.isEmpty()) {
            if (requestStack.isEmpty())
                throw new RuntimeException("Queue is Empty");
            else {
                while (!requestStack.isEmpty()) {
                    responseStack.push(requestStack.pop());
                }
            }
        }
        return responseStack.pop();
    }

    public int peek() {
        if (responseStack.isEmpty()) {
            if (requestStack.isEmpty())
                throw new RuntimeException("Queue is Empty");
            else {
                while (!requestStack.isEmpty()) {
                    responseStack.push(requestStack.pop());
                }
            }
        }
        return responseStack.peek();
    }

    public void display() {
        if (responseStack.isEmpty()) {
            if (requestStack.isEmpty())
                throw new RuntimeException("Queue is Empty");
            else {
                System.out.println(requestStack);
                return;
            }
        }
        System.out.println(responseStack);
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();

        while (true) {
            System.out.println();
            System.out.println("queue Menu");
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
                    queue.enqueue(item);
                    break;
                }
                case 2: {
                    int item = queue.peek();
                    System.out.println("Top of the queue " + item);
                    break;
                }
                case 3: {
                    int item = queue.deque();
                    System.out.println("Popping the item " + item);
                    break;
                }
                case 4: {
                    System.out.println("Display the elements");
                    queue.display();
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
