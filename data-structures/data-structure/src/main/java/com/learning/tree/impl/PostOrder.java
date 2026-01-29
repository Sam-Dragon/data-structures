package com.learning.tree.impl;

/*
 *          Root ->  30
 *                 /    \
 *               20      50
 *              /  \    /  \
 *            15   25  40  60
 * */
public class PostOrder extends BinarySearchTreeImpl {

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

        postOrder(root);
        System.out.println();
    }

    private static void postOrder(Node root) {
        if (root != null) {
            postOrder(root.getLeft());
            postOrder(root.getRight());
            System.out.print(root.getData() + " ");
        }
    }
}
