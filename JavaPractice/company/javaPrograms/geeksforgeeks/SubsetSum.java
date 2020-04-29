package com.company.javaPrograms.geeksforgeeks;

import java.util.Scanner;

public class SubsetSum {
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while (k != 0) {

            int n = sc.nextInt();
            int sum = sc.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int x = 0, y = 0, temp = sum;

            while (sum != 0 && x < n) {
                if (sum == 0)
                    break;

                if (sum < 0) {
                    x = x + 1;
                    y = x;
                    sum = temp;
                }

                if (y >= n)
                    break;

                sum = sum - a[y];
                y++;
            }
            if (sum == 0)
            System.out.println(x + 1 + " " + (y));
            else
            System.out.println("-1");

            k--;
        }
    }
}
