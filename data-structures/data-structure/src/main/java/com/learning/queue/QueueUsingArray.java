package com.learning.queue;

import java.util.Arrays;
import java.util.Scanner;

public class QueueUsingArray {

    int SIZE = 5, head = -1, tail = -1, length = 0;
    int[] array = new int[SIZE];

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(int data) {
        // Validation
        if (tail == SIZE - 1) {
            throw new RuntimeException("Queue is Full");
        }

        // Increment
        tail = tail + 1;
        if (head == -1)
            head = tail;

        // Insert
        array[tail] = data;
        length++;
    }

    public int deque() {
        // Validation
        if (head == -1) {
            throw new RuntimeException("Queue is Empty");
        }

        if (head == tail) {
            int value = array[head];
            array[head] = 0;
            head = tail = -1;
            return value;
        }

        // Decrement
        int value = array[head];
        array[head] = 0;
        head = head + 1;

        // Delete
        length--;
        return value;
    }

    public int peek() {
        // Validation
        if (head == -1) {
            throw new RuntimeException("Queue is Empty");
        }

        return array[head];
    }

    public void display() {
        if (size() == 0) {
            throw new RuntimeException("Queue is Empty");
        }

        for (int i = head; i <= tail; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void contents() {
        Arrays.stream(array)
              .boxed()
              .forEach(e -> System.out.print(e + " "));
    }

    public static void main(String[] args) {
        QueueUsingArray Queue = new QueueUsingArray();

        while (true) {
            System.out.println();
            System.out.println("Queue Menu");
            String options = """
                    1. Enqueue
                    2. Peek
                    3. Deque
                    4. Display
                    5. Contents
                    6. Exit
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
                    Queue.enqueue(item);
                    break;
                }
                case 2: {
                    int item = Queue.peek();
                    System.out.println("Top of the Queue " + item);
                    break;
                }
                case 3: {
                    int item = Queue.deque();
                    System.out.println("Popping the item " + item);
                    break;
                }
                case 4: {
                    System.out.println("Display the elements");
                    Queue.display();
                    System.out.println();
                    break;
                }
                case 5: {
                    System.out.println("Contents of the Array");
                    Queue.contents();
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