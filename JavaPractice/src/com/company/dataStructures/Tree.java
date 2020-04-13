package com.company.dataStructures;

import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    public TreeNode(int data) {
        this.data = data;
    }
}
public class Tree {
    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public Tree() {
        this.root = null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tree tree = new Tree();
        tree.createBinaryTree();

        while (true) {
            System.out.println();
            System.out.println("Enter your choice");
            System.out.println("1. Pre order traversal");
            System.out.println("2. Post order traversal");
            System.out.println("3. In order traversal");
            int n = sc.nextInt();
            switch (n) {
                case (1):
                    tree.preOrder(tree.root);
                    break;
                case (2) :
                    tree.postOrder(tree.root);
                    break;
                case (3) :
                    tree.inOrder(tree.root);
                    break;
            }
        }
    }

    private void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    private void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    private void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }



    private void createBinaryTree() {
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(6);
        TreeNode node4 = new TreeNode(8);
        TreeNode node5 = new TreeNode(9);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
        root = node1;
    }

}
