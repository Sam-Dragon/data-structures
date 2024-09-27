package learn.data_structures.queue.linked_list;

import learn.util.Node;

import java.util.Scanner;

public class QueueUsingDoublyLinkedList {
    Node front, rear;

    QueueUsingDoublyLinkedList() {
        front = rear = null;
    }

    public static void main(String[] args) {
        QueueUsingDoublyLinkedList queue = new QueueUsingDoublyLinkedList();
        queue.process();
    }

    public void process() {
        Scanner sc = new Scanner(System.in);

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

    private boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int element) {
        System.out.println("Inserting " + element + " to the queue");
        Node newNode = new Node(element);

        if (rear != null) {
            rear.setNext(newNode);
            rear = newNode;
        } else {
            // First element in queue
            front = rear = newNode;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Element removed :: " + front.getValue());
        front = front.getNext();
    }

    public void display() {
        Node currentNode = front;

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Content :: ");
        while (currentNode != null) {
            System.out.print(currentNode.getValue() + " ");
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }
}

