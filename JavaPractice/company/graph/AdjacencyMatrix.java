package com.company.graph;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class AdjacencyMatrix {
    boolean vis [];

    public AdjacencyMatrix(int n) {
        this.vis = new boolean[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of vertex and edges");
        int V = sc.nextInt();
        int e = sc.nextInt();
        int a[][] = new int[V][V];
        System.out.println("Enter details for adjacency matrix now: ");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            a[u][v] = 1;
        }

        System.out.println("Adjacency Matrix: ");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        AdjacencyMatrix ad = new AdjacencyMatrix(V);
        ad.bfs(a, V, 0);
    }

    private void bfs(int[][] a, int v, int i) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(i);
        while (!queue.isEmpty()) {
            Integer element = queue.remove();
            if (Objects.nonNull(element) && !vis[element]) {
                System.out.println(element);
                vis[element] = true;
            }
            for (int j = 0; j < v; j++) {
                if ((a[element][j] != 0) && !vis[j]) {
                    queue.add(j);
                }
            }
        }
    }
}
