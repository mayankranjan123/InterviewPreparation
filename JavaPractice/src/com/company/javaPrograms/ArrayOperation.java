package com.company.javaPrograms;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {
    static void insert(int[] a, int n, int item, int pos) {
        for (int i = n - 1; i >= pos; i-- ) {
            a[i+1] =a[i];
        }
        a[pos] = item;

        System.out.println("Array elements after insertion");
        for (int i = 0; i <=n; i++) {
            System.out.println(a[i]);
        }
    }

    static void del(int[] a, int n, int pos) {
        for (int i = pos; i < n; i++) {
            a[i] = a[i + 1];
            n--;
        }
        System.out.println("Array elements after deletion");
        for (int i = 0; i <=n; i++) {
            System.out.println(a[i]);
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
        //Insert element
        System.out.println("Enter item and position to insert");
        //int item = sc.nextInt();
        int pos = sc.nextInt();
        //insert(a, n, item, pos);
        del(a, n, pos);
    }
}
