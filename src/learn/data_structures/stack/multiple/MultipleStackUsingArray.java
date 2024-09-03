package learn.data_structures.stack.multiple;

import java.util.Scanner;

public class MultipleStackUsingArray {

    int size;
    int top_from_beginning = -1, top_from_middle;
    int[] arr;

    public static void main(String[] args) {
        MultipleStackUsingArray ms = new MultipleStackUsingArray();
        ms.process();
    }

    private void process() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements :: ");
        size = sc.nextInt();

        top_from_middle = (size / 2) - 1;
        arr = new int[size];
        System.out.println("Size of the stack :: " + size);

        System.out.println("\nPlease select the operation to perform");
        while (true) {
            String operation = """
                1. Insert from Beginning
                2. Insert from Middle
                3. Delete from Beginning
                4. Delete from Middle
                5. Display
                """;
            System.out.println(operation);

            System.out.println("Enter the operation to perform");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the element to insert from beginning");

                    int element = sc.nextInt();
                    System.out.println("Inserting element :: " + element);

                    pushFromBeginning(arr, element);
                }
                case 2 -> {
                    System.out.println("Enter the element to insert from Middle");

                    int element = sc.nextInt();
                    System.out.println("Inserting element :: " + element);

                    pushFromMiddle(arr, element);
                }

                case 3 -> popFromBeginning();
                case 4 -> popFromMiddle();
                case 5 -> display();
                default -> System.exit(1);
            }
            System.out.println();
        }
    }


    private void pushFromBeginning(int[] arr, int element) {
        if (top_from_beginning == (size / 2) - 1) {
            System.out.println("Top Stack is full");
            return;
        }

        arr[++top_from_beginning] = element;
    }

    private void pushFromMiddle(int[] arr, int element) {
        if (top_from_middle == size - 1) {
            System.out.println("Middle Stack is full");
            return;
        }

        arr[++top_from_middle] = element;
    }

    private void popFromBeginning() {
        if (top_from_beginning == -1) {
            System.out.println("Top Stack is Empty");
            return;
        }

        System.out.println("Element Removed :: " + arr[top_from_beginning--]);
    }

    private void popFromMiddle() {
        if (top_from_middle == (size / 2) - 1) {
            System.out.println("Middle Stack is Empty");
            return;
        }

        System.out.println("Element Removed :: " + arr[top_from_middle--]);
    }

    private void display() {
        if (top_from_beginning == -1 && top_from_middle == (size / 2) - 1) {
            System.out.println("Stack is Empty");
            return;
        }

        System.out.print("Content :: ");
        for (int i = 0; i <= top_from_beginning; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = (size / 2); i <= top_from_middle; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
