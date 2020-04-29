package com.company.javaPrograms;

import java.util.Scanner;

public class SpiralMatrix {
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
        SpiralMatrix sp = new SpiralMatrix();
        sp.spiralOrder(a, m, n);
    }

    private void spiralOrder(int[][] a, int m, int n) {

    }
}
