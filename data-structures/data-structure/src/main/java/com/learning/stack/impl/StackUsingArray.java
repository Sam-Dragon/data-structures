package com.learning.stack.impl;

import java.util.Arrays;
import java.util.Scanner;

class StackArray {

    private final int SIZE = 5;
    private int top = -1;
    private int[] array = new int[SIZE];

    public void push(int item) {
        if (SIZE - 1 == top) {
            System.out.println("Stack Overflow");
            return;
        }

        top = top + 1;
        array[top] = item;
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
            return;
        }

        int index = 0;
        while (index <= top) {
            System.out.print(array[index] + " ");
            index++;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        int item = array[top];
        array[top] = 0;
        top = top - 1;

        return item;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return array[top];
    }

    public void contents() {
        Arrays.stream(array)
              .boxed()
              .forEach(e -> {
                  System.out.print(e + " ");
              });
    }
}

public class StackUsingArray {

    public static void main(String[] args) {
        StackArray stack = new StackArray();

        while (true) {
            System.out.println();
            System.out.println("Stack Menu");
            String options = """
                    1. Push
                    2. Peek
                    3. Pop
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
                case 5: {
                    System.out.println("Contents of the Array");
                    stack.contents();
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
