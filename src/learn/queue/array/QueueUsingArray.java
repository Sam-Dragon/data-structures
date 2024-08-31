package learn.queue.array;

import java.util.Scanner;

public class QueueUsingArray {

    int size, front = 0, rear = -1;
    int[] arr;

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray();
        queue.process();
    }

    public void process() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPlease enter the size of the queue: ");
        size = sc.nextInt();

        System.out.println("Entered queue size is :: " + size);
        arr = new int[size];

        while (true) {
            System.out.println();
            String options = """
                1. Insert
                2. Delete
                3. Display
                """;
            System.out.println(options);
            System.out.println("Please enter your choice :: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the element to insert : ");
                    int element = sc.nextInt();

                    enqueue(element);
                }
                case 2 -> dequeue();
                case 3 -> display();
                default -> System.exit(0);
            }
        }
    }

    public void enqueue(int element) {
        if (front > rear) {
            front = 0;
            rear = -1;
        }

        System.out.println("Inserting " + element + " to the queue");
        if (rear == size - 1) {
            System.out.println("Queue is full");
            return;
        }

        arr[++rear] = element;
    }

    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Element Removed :: " + arr[front++]);
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Contents :: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
