package com.company.javaPrograms;

import java.util.Scanner;
public class MaxMin {
    static void minAndMax(int [] a, int lb, int ub, int max, int min) {
        int min1, max1;
        if (lb == ub) {
            min = max = a[lb];
        } else if ((ub - lb) == 1) {
            if (a[lb] > a[ub]) {
                min = a[ub];
                max = a[lb];
            } else {
                min = a[lb];
                max = a[ub];
            }
        } else {
            int mid = (lb + ub) / 2;
            //left sub-array
            minAndMax(a, lb, mid, max, min);
            //right sub-array
            max1 = max;
            min1 = min;
            minAndMax(a, mid + 1, ub, max1, min1);

            if (max1 > max) {
                max = max1;
            }
            if (min1 < min) {
                min = min1;
            }
            System.out.println("Max: " + max + " Min: " + min);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        minAndMax(a, 0, n - 1, 4, 4);
    }
}
