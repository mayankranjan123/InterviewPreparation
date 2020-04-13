package com.company.javaPrograms;

import java.util.Scanner;

public class CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of array elements");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter sum total");
        int sum = sc.nextInt();
        int coin[][] = new int[a.length + 1][sum + 1];
        for (int i = 0; i <= a.length; i++) {
            for (int j = 0; j <= sum; j++) {
                if (i == 0 && j == 0)
                    coin[i][j] = 1;
                else if (i == 0)
                    coin[i][j] = 0;
                else if (j == 0)
                    coin[i][j] = 1;
                else if (i > j) {
                    coin[i][j] = coin[i - 1][j];
                } else {
                    coin[i][j] = coin[i - 1][j] + coin[i][j - i];
                }
            }
        }
        System.out.println("No. of ways: " + coin[a.length][sum]);

    }
}
