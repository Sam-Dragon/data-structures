package com.learning.tree.programs;

public class MinValueOfNode {
    protected static class Node {
        private Node left;
        private int data;
        private Node right;

        public Node(int data) {
            this.left = null;
            this.data = data;
            this.right = null;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

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

        int minOfNodes = minOfNodes(root);
        System.out.println("Lead Nodes = " + minOfNodes);
    }

    private static int minOfNodes(Node root) {
        int count = 0;

        if (root != null) {
            count += minOfNodes(root.left);
            if (root.left == null)
                return root.data;
        }

        return count;
    }
}
