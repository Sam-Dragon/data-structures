package com.learning.tree.impl;

import java.util.Scanner;

public class BinarySearchTreeImpl {

    private class Node {
        private Node left;
        private int data;
        private Node right;

        public Node(int data) {
            this.left = null;
            this.data = data;
            this.right = null;
        }
    }

    Node root = null;

    public void insert(int data) {
        // validation
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
        } else {
            Node temp = root;
            while (true) {
                if (data < temp.data) {
                    // TRAVERSE LEFT AND INSERT
                    if (temp.left == null) {
                        temp.left = newNode;
                        break;
                    }
                    temp = temp.left;
                } else {
                    // TRAVERSE RIGHT AND INSERT
                    if (temp.right == null) {
                        temp.right = newNode;
                        break;
                    }
                    temp = temp.right;
                }
            }
        }
    }

    private boolean search(int item) {
        boolean result = false;

        if (root == null) {
            throw new RuntimeException("Tree is Empty");
        }

        Node temp = root;
        while (temp != null) {
            if (item < temp.data) {
                temp = temp.left;
            } else if (item > temp.data) {
                temp = temp.right;
            } else {
                return true;
            }
        }

        return result;
    }

    public int delete(int data) {

        return -1;
    }

    public void display() {

    }

    public static void main(String[] args) {
        BinarySearchTreeImpl binarySearchTree = new BinarySearchTreeImpl();

        while (true) {
            System.out.println();
            System.out.println("binarySearchTree Menu");
            String options = """
                    1. Insert
                    2. Delete
                    3. Search
                    4. Display
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
                    binarySearchTree.insert(item);
                    break;
                }
                case 2: {
                    int item = binarySearchTree.delete(1);
                    System.out.println("Popping the item " + item);
                    break;
                }
                case 3: {
                    System.out.print("Enter the item ");
                    int item = sc.nextInt();
                    System.out.println("Search the element " + item);
                    boolean present = binarySearchTree.search(item);
                    System.out.println("Element " + item + " found ? :: " + (present));
                    System.out.println();
                    break;
                }
                case 4: {
                    System.out.println("Display the elements");
                    binarySearchTree.display();
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
