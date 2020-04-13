package com.company.javaPrograms;

import java.util.Scanner;

public class ZigZagArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        ZigZagArray zig = new ZigZagArray();
        zig.doArrayZigZag(a, 0, n);
    }

    private void doArrayZigZag(int[] a, int start, int end) {
        int f = 0;
        while (start < end - 1) {
            if (f == 0) {
                if (a[start] > a[start + 1])
                {
                    a[start] = a[start] ^ a[start + 1];
                    a[start + 1] = a[start] ^ a[start + 1];
                    a[start] = a[start] ^ a[start + 1];
                }
            }
            if (f == 1) {
                if (a[start] < a[start + 1]) {
                    a[start] = a[start] ^ a[start + 1];
                    a[start + 1] = a[start] ^ a[start + 1];
                    a[start] = a[start] ^ a[start + 1];
                }
            }
            f = ((f == 0) ? 1 : 0);
            start ++;
        }

        for (int i = 0; i < end; i++) {
            System.out.println(a[i]);
        }
    }
}
