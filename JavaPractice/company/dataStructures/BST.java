package com.company.dataStructures;

import java.util.Scanner;

public class BST {
    TreeNode root;
    int sum = 0;
    int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST bst = new BST();
        while (true) {
            System.out.println();
            System.out.println("Enter your choice");
            System.out.println("1. Insert element in BST");
            System.out.println("2. View Element In order in BST");
            System.out.println("3. Find element in BST");
            System.out.println("4. Find max element in BST");
            System.out.println("5. Delete element in BST");
            System.out.println("6. Inorder parent element in BST");
            System.out.println("7. Inorder predecessor element in BST");
            System.out.println("8. Inorder successor element in BST");
            System.out.println("9. Minimum element in BST");
            System.out.println("10. Total no. of BST Possible");
            System.out.println("11. Diameter of a binary tree");
            System.out.println("12. Print path with given sum of a binary tree");
            System.out.println("13. Check if sum tree");
            System.out.println("14. Get K distance nodes from root");
            System.out.println("15. Get Lowest common ancestors");
            System.out.println("16. Gte nodes having k leaves");
            int n = sc.nextInt();

            switch (n) {
                case (1) :
                    System.out.println("Enter element");
                    bst.root = bst.insert(bst.root, sc.nextInt());
                    break;
                case (2) :
                    bst.inOrder(bst.root);
                    break;
                case (3) :
                    System.out.println("Enter element to find: ");
                    System.out.println("Element present: " + bst.find(bst.root, sc.nextInt()));
                    break;
                case (4) :
                    System.out.println("Max element is: " + bst.findMax(bst.root).data);
                    break;
                case (5) :
                    System.out.println("Enter element to delete");
                    bst.root = bst.deleteNode(bst.root, sc.nextInt());
                    break;
                case (6) :
                    System.out.println("Enter element to find inorder parent of");
                    System.out.println("Inorder Parent : " + bst.inorderParent(bst.root, sc.nextInt()).data);
                    break;
                case (7) :
                    System.out.println("Enter element to find inorder predecessor: ");
                    bst.inorderPredecessor(bst.root, sc.nextInt());
                    break;
                case (8) :
                    System.out.println("Enter element to find inorder successor: ");
                    bst.inorderSuccessor(bst.root, sc.nextInt());
                    break;
                case (9) :
                    System.out.println("Min element is: " + bst.findMin(bst.root).data);
                    break;
                case (10) :
                    System.out.println("Enter value of n");
                    System.out.println("No. of BST possible: " + bst.getPossibleBST(sc.nextInt()));
                    break;
                case (11) :
                    System.out.println("Diameter of a binary tree: " + bst.diameter(bst.root));
                    break;
                case (12) :
                    System.out.println("Enter sum value");
                    bst.pathWithGivenSum(bst.root, new Stack(-1, 10), sc.nextInt());
                    break;
                case (13) :
                    System.out.println("Is Sum tree: " + bst.isSumTree(bst.root));
                    break;
                case (14) :
                    System.out.println("Enter value of k :");
                    bst.getKDistanceNodes(bst.root, sc.nextInt());
                    break;
                case (15) :
                    System.out.println("Enter two nodes :");
                    System.out.println("LCA: " + bst.getLCA(bst.root, sc.nextInt(), sc.nextInt()).data);
                    break;
                case (16) :
                    System.out.println("Enter value of k: ");
                    bst.getKLeavesNodes(bst.root, sc.nextInt());
                    break;
            }
        }
    }

    private int getKLeavesNodes(TreeNode node, int k) {
        if (node.left == null && node.right == null)
            return 1;
        else {
            int lc = countLeaves(node.left);
            int rc = countLeaves(node.right);
            int tlc = lc + rc;
            if (tlc == k)
                System.out.println(k + " ");
            else
                return tlc;
        }
        return 0;
    }

    private int countLeaves(TreeNode node) {
       if (node != null) {
           if (node.left == null && node.right == null)
               count ++;
           if (node.left != null)
               countLeaves(node.left);
           if (node.right != null)
               countLeaves(node.right);
       }
       return count;
    }

    private TreeNode getLCA(TreeNode node, int p, int q) {
        if (node == null)
            return null;
        if (node.data == p || node.data == q)
            return node;
        node.left = getLCA(node.left, p, q);
        node.right = getLCA(node.right, p, q);
        if (node.left != null && node.right!= null)
            return node;
        return (node.left != null) ? node.left : node.right;
    }

    private void getKDistanceNodes(TreeNode node, int k) {
        if (node == null)
            return;
        else if (k == 0) {
            System.out.print(node.data + " ");
            return;
        }
        else {
            if (node.left != null) {
                getKDistanceNodes(node.left, k - 1);
            }
            if (node.right != null) {
                getKDistanceNodes(node.right, k - 1);
            }
        }
    }

    private boolean isSumTree(TreeNode node) {
        if (node == null)
            return true;
        if (node.left == null && node.right == null)
            return true;
        int lsum = add(node.left);
        int rsum = add(node.right);
        if (node.data == lsum + rsum) {
            if (isSumTree(node.left) && isSumTree(node.right))
                return true;
        }
        return false;
    }

    private int add(TreeNode node) {
      if (node == null)
          return 0;
      int sum = node.data + add(node.left) + add((node.right));
      return sum;
    }

    private void pathWithGivenSum(TreeNode node, Stack st, int k) {
        if (node == null)
            return;
        else {
            st.top++;
            st.stack[st.top] = node.data;
            sum = sum + node.data;
            if (sum == k) {
                for (int i = st.top; i >= 0; i--)
                    System.out.print(st.stack[i]);
                return;
            }
            pathWithGivenSum(node.left, st, k);
            pathWithGivenSum(node.right, st, k);
            sum = sum - node.data;
            st.top --;


        }

    }

    private int diameter(TreeNode node) {
        if (node == null)
            return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        int ld = diameter(node.left);
        int rd = diameter(node.right);
        int fd = Math.max(lh + rh + 1, Math.max(ld, rd));
        return fd;
    }

    private int height(TreeNode node) {
        if (node == null)
            return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        int th = 0;
        if (lh > rh)
            th = lh + 1;
        else
            th = rh + 1;
        return th;

    }

    private int getPossibleBST(int n) {
        int a[] = new int [n + 1];
        a[0] = a[1] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = 0;
            for (int j = 0; j < i; j++) {
                a[i] = a[i] + a[j] * a[i - j - 1];
            }
        }
        return a[n];
    }

    private void inorderSuccessor(TreeNode node, int val) {
        if (node == null)
            System.out.println("No element present");
        else {
            TreeNode store = null;
            while (node.data != val) {
                if (node.data > val) {
                    store = node;
                    node = node.left;
                } else {
                    node = node.right;
                }
            }

                if (node.right != null) {
                    TreeNode temp = node;
                    temp = findMin(temp.right);
                    System.out.println("Inorder successor: " + temp.data);
                } else {
                    System.out.println("Inorder successor: " + store.data);
                }
            }
    }

    private TreeNode findMin(TreeNode node) {
        if (node == null)
            return  null;
        else if (node.left == null && node.right == null)
            return node;
        else if (node.left == null)
            return node;
        return findMin(node.left);
    }

    private void inorderPredecessor(TreeNode node, int val) {
        if (node == null)
            System.out.println("No element present");
        else {
            TreeNode store = null;
            while (node.data != val) {
                if (node.data > val) {
                    node = node.left;
                } else {
                    store = node;
                    node = node.right;
                }
            }
            if (node.left != null) {
                TreeNode temp = node;
                temp = findMax(temp.left);
                System.out.println("Inorder predecessor: " + temp.data);
            } else {
                System.out.println("Inorder predecessor : " + store.data);
            }

        }
    }

    private TreeNode inorderParent(TreeNode node, int val) {
        if (node == null)
            return null;
        else {
            TreeNode inorderParent = null;
            while (node != null) {
            if (node.data > val) {
                inorderParent = node;
                node = node.left;
            } else if (node.data < val)
                node = node.right;
            else
                break;
            }
            return node != null ? inorderParent : null;
        }
    }

    private TreeNode deleteNode(TreeNode node, int val) {
        if (node == null) {
            System.out.println("Element not present");
        } else if (val > node.data) {
            node.right = deleteNode(node.right, val);
        } else if (val < node.data) {
            node.left = deleteNode(node.left, val);
        } else {
            // if (both) two children are present
            if (node.left != null && node.right != null) {
                TreeNode temp = findMax(node.left);
                node.data = temp.data;
                node.left = deleteNode(node.left, node.data);
            } else {
                if (node.left == null)
                    node = node.right;
                else if (node.right == null)
                    node = node.left;
            }
        }
        return node;
    }

    private  TreeNode findMax(TreeNode node) {
        if (node == null)
            return  null;
        else if (node.left == null && node.right == null)
            return node;
        else if (node.right == null)
            return node;
        return findMax(node.right);
    }

    private boolean find(TreeNode node, int val) {
        if (node == null)
            return false;
        else if (node.data > val)
            return find (node.left, val);
        else if (node.data < val)
            return find (node.right, val);
        return true;
    }

    private void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    private TreeNode insert(TreeNode node, int data) {
        if (node == null)
            return createNewNode(data);

        if (data > node.data)
            node.right =  insert(node.right, data);
        else if (data < node.data)
            node.left = insert(node.left, data);

        return node;
    }

    private TreeNode createNewNode(int data) {
        TreeNode node = new TreeNode();
        node.data = data;
        root = node;
        return root;
    }
}
