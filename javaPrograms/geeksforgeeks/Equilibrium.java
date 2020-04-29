package com.company.javaPrograms.geeksforgeeks;

import java.util.Scanner;

public class Equilibrium {
    public static void main(String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        while (k != 0) {
            int n = sc.nextInt();
            int flag = 0;
            int a[] = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();


            if (n == 0) {
                System.out.println("-1");
            }

            else if (n == 1) {
                System.out.println(n);
            }

            else {
                int lsum = 0, rsum = 0, sum = 0;

                for (int i = 0; i < n; i++)
                    sum += a[i];

                rsum = sum;

                for (int i = 0; i < n; i++) {
                    lsum = lsum + a[i];

                    if (lsum == rsum) {
                        System.out.println(i + 1);
                        flag = 1;
                        break;
                    }
                    rsum = rsum - a[i];
                }
                if (flag == 0)
                    System.out.println("-1");
            }

            k--;
        }
    }
}