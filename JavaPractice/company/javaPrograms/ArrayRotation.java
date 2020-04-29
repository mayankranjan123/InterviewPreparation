package com.company.javaPrograms;

import java.util.Scanner;

public class ArrayRotation {
    int[] rotate(int [] a, int n, int rot) {
        int j = 0, temp[] = new int [rot];
        for (int i = 0; i < n; i++) {
            if (i < rot) {
                temp[i] = a[i];
            } else {
                a[j] = a[i];
                j++;
            }
        }

        int m = 0;
        for (int k = j; k < n; k++) {
            a[k] = temp[m];
            m ++;
        }
        return a;

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
        System.out.println("Enter index to rotate against");
        int rot = sc.nextInt();

        ArrayRotation ar = new ArrayRotation();
        if (rot < n) {
            a = ar.rotate(a, n, rot);
            System.out.println("Array after rotation");
            for (int i = 0; i < n; i++) {
                System.out.println(a[i]);
            }
        } else {
            System.out.println("Rotation not allowed");
        }
    }
}
