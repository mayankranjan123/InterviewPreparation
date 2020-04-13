package com.company.javaPrograms;

import java.util.Scanner;

public class SortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows and no. of columns for matrix 2");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int a[][] = new int [m][n];

        System.out.println("Enter matrix :" + m + "*" + n +  ",elements");
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered matrix :");
        for (int i = 0 ; i < m ; i++) {
            for (int j = 0 ; j < n ; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
        System.out.println("Enter item to be found");
        int item = sc.nextInt();
        SortedMatrix sm = new SortedMatrix();
        sm.searchElement(a, n, item);
    }

    private void searchElement(int[][] a, int n, int item) {
        int i = 0, j = n - 1;
        while (i < n && j >= 0) {
            if (a[i][j] == item) {
                System.out.println("Item found at row:" + i + " column: " + j);
                return;
            }
            else if (a[i][j] > item) {
                j--;
            } else if (a[i][j] < item) {
                i++;
            } else {
                System.out.println("Item not found");
            }
        }
        System.out.println("Item not found");
    }
}
