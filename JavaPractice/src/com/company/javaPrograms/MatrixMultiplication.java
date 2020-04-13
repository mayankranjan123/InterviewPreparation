package com.company.javaPrograms;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        System.out.println("Enter no. of rows and no. of columns for matrix 1");
        Scanner sc = new Scanner(System.in);
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();

        System.out.println("Enter no. of rows and no. of columns for matrix 2");
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not allowed");
            return;
        }

        int a[][] = new int [rows1][cols1];
        int b[][] = new int[rows2][cols2];

        System.out.println("Enter matrix1 :" + rows1 + "*" + cols1 +  ",elements");
        for (int i = 0 ; i < rows1 ; i++) {
            for (int j = 0 ; j < cols1 ; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered matrix1 :");
        for (int i = 0 ; i < rows1 ; i++) {
            for (int j = 0 ; j < cols1 ; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }

        System.out.println("Enter matrix2 :" + rows2 + "*" + cols2 +  ",elements");
        for (int i = 0 ; i < rows2 ; i++) {
            for (int j = 0 ; j < cols2 ; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Entered matrix2 :");
        for (int i = 0 ; i < rows2 ; i++) {
            for (int j = 0 ; j < cols2 ; j++) {
                System.out.print(" " + b[i][j]);
            }
            System.out.println();
        }

        System.out.println("Matrix multiplication : ");

        int c[][] = new int[10][10];
        int sum;

        for (int i = 0 ; i < rows1 ; i++) {
            for (int j = 0 ; j < cols2 ; j++) {
                sum = 0;
                for (int k = 0 ; k < rows2 ; k++) {
                    sum = sum + a[i][k] * b[k][j];
                }
                c[i][j] = sum;
            }
        }

        for (int i = 0 ; i < rows1 ; i++) {
            for (int j = 0 ; j < cols2 ; j++) {
                System.out.print(" " + c[i][j]);
            }
            System.out.println();
        }


    }
}
