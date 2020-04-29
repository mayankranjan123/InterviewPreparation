package com.company.javaPrograms;

import java.util.Scanner;

public class BinarySearch {
    static void binarySearch(int [] a, int lb, int ub, int item) {
        if (lb <= ub) {
         int mid = (lb + ub) / 2;
         if (a[mid] == item)
             System.out.println("Element found at index: " + mid);
         else if (a[mid] > item)
             binarySearch(a, lb, mid - 1, item);
         else
             binarySearch(a, mid + 1, ub, item);
        } else {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter element to search");
        int item = sc.nextInt();
        binarySearch(a, 0, n-1, item);
    }
}
