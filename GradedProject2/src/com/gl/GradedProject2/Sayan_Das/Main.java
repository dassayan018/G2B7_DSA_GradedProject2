package com.gl.GradedProject2.Sayan_Das;
class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class Main {
    Node node;

    // Right rotation to convert to skewed tree
    private Node rightRotate(Node root) {
        Node newRoot = root.left;
        root.left = newRoot.right;
        newRoot.right = root;
        return newRoot;
    }

    // Convert BST to skewed tree
    private Node convertToSkewedTree(Node root) {
        while (root != null && root.left != null) {
            root = rightRotate(root);
        }
        if (root != null && root.right != null) {
            root.right = convertToSkewedTree(root.right);
        }
        return root;
    }

    // In-order traversal to print node values
    private void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.value + " ");
            inOrderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left = new Node(55);

        Node skewedTreeRoot = tree.convertToSkewedTree(tree.node);
        tree.inOrderTraversal(skewedTreeRoot);
    }
}
