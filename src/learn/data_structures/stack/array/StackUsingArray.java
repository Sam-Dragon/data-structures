package learn.data_structures.stack.array;

import java.util.Scanner;

public class StackUsingArray {
    int top = -1;
    int size;
    int[] arr;

    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray();

        stack.process();
    }

    private void process() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements :: ");
        size = sc.nextInt();
        arr = new int[size];
        System.out.println("Size of the stack :: " + size);

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

                    push(arr, element);
                }

                case 2 -> peek();
                case 3 -> pop();
                case 4 -> display();
                default -> System.exit(1);
            }
            System.out.println();
        }
    }

    private void peek() {
        if (top == -1) {
            System.out.println("Stack is underflow");
            return;
        }

        System.out.println("Top Element :: " + arr[top]);
    }

    private void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }

        System.out.print("Content :: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    private void pop() {
        if (top == -1) {
            System.out.println("Stack is underflow");
            return;
        }

        System.out.println("Element Removed :: " + arr[top--]);
    }

    private void push(int[] arr, int element) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = element;
    }
}
