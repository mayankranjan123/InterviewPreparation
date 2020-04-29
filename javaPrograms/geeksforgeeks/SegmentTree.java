package com.company.javaPrograms.geeksforgeeks;

public class SegmentTree {
    public static void main(String[] args) {

        int a[] = new int[] {1,2,3};
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");

        int [] tree = new int[2 * a.length];
        SegmentTree segmentTree = new SegmentTree();
        segmentTree.buildTree(a, tree, 0, 2, 1);

        System.out.println();
        for (int i = 1; i < 2 * a.length; i++)
            System.out.print(tree[i] + " ");

        System.out.println("Sum: " + segmentTree.query(tree, 0, 2, 1, 1, 2));
    }

    private int query(int[] tree, int start, int end, int node, int l, int r) {
        if (l > end || r < start)
            return 0;
        if (l <= start && r >= end)
            return tree[node];
        int mid = (start + end) / 2;
        int p1 = query(tree, start, mid, 2 * node, l, r);
        int p2 = query(tree, mid + 1, end, (2 * node) + 1, l, r);
        return p1 + p2;
    }

    private void buildTree(int[] a, int[] tree, int start, int end, int node) {
        if (start == end) {
            tree [node] = a[start];
            return;
        }
        int mid = (start + end) / 2;
        buildTree(a, tree, start, mid, 2 * node);
        buildTree(a, tree, mid + 1, end, (2 * node) + 1);
        tree[node] = tree[2 * node] + tree[(2 * node) + 1];
    }
}
