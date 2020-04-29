package com.company.javaPrograms.geeksforgeeks;

import java.util.Scanner;

public class MinimumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        while (k != 0) {
            int n = sc.nextInt();
            int a[] = new int[n];

            for (int i =0; i < n; i++)
                a[i] = sc.nextInt();

            System.out.println(minimumSum(a, n));
            k--;
        }
    }

    private static int minimumSum(int[] a, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];

        boolean subset [] = subsetSum(a, n, sum);

        int min = Integer.MAX_VALUE;
        int temp = 0;
        for (int i = 0; i <= sum / 2; i++) {
            if (subset[i] == true) {
                temp = sum - (2 * i);
                if (temp < min)
                    min = temp;
            }
        }
        return min;
    }

    private static boolean[] subsetSum(int[] a, int n, int sum) {
        boolean t [][] = new boolean[n + 1][sum + 1];

        for (int i = 0; i <= sum; i++)
            t[0][i] = false;

        for (int i = 0; i <= n; i++)
            t[i][0] = true;

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= sum; j++) {
                if (a[i - 1] <= j)
                    t[i][j] = t[i -1][j - a[i  - 1]] || t[i - 1][j];
                if (a[i - 1] > j)
                    t[i][j] = t[i -1][j];
            }
        }
            return t [n];
    }
}
