package com.company.javaPrograms;

import java.util.Scanner;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Factorial {
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while (k != 0) {
            int n = sc.nextInt();
            int x = 1;
            int a[] = new int[n];
            for (int i = 0; i < n-1; i++)
                a[i] = sc.nextInt();

            int y = a[0];
            for (int i = 2; i <= n; i++) {
                x = x ^ i;
            }

            for (int i = 1; i < n; i++) {
                y = y^a[i];
            }

            System.out.println(x^y);
            k--;
        }
    }
}
