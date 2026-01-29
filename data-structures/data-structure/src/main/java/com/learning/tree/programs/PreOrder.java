package com.learning.tree.programs;

import com.learning.tree.impl.BinarySearchTreeImpl;

public class PreOrder extends BinarySearchTreeImpl {

    public static void main(String[] args) {
        Node thirtyNode = new Node(30);
        Node root = thirtyNode;

        Node twentyNode = new Node(20);
        thirtyNode.setLeft(twentyNode);

        Node fifteenNode = new Node(15);
        twentyNode.setLeft(fifteenNode);

        Node twentyFiveNode = new Node(25);
        twentyNode.setRight(twentyFiveNode);

        Node fiftyNode = new Node(50);
        thirtyNode.setRight(fiftyNode);

        Node fourtyNode = new Node(40);
        fiftyNode.setLeft(fourtyNode);

        Node sixtyNode = new Node(60);
        fiftyNode.setRight(sixtyNode);

        preOrder(root);
        System.out.println();
    }

    private static void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.getData() + " ");
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
}
