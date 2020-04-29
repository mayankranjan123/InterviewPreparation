package com.company.javaPrograms.geeksforgeeks;

import java.util.Scanner;
import java.util.Stack;


//public static void main (String[] args) throws IOException {
//        //code
      //BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
//        int k = Integer.parseInt(sc.readLine());
//        while (k != 0) {
//        int n = Integer.parseInt(sc.readLine());
//        int a[] = new int [n];
//
//        String [] s = sc.readLine().split(" ");
//        for (int i = 0; i < n; i++)
//        a[i] = Integer.parseInt(s[i]);
//
//        System.out.println(kadane(a, n));
//
//        k--;
//
//        }
//
//        }

public class KadaneAlgo {
    public static void main (String[] args) {
        //code
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        int k = sc.nextInt();
        while (k != 0) {
            int n = sc.nextInt();
            int a[] = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            int flag = 0;
            int maxSum = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                if (a[i] > 0) {
                    flag = 1;
                }

                if (a[i] > maxSum)
                    maxSum = a[i];
            }

            if (flag == 0) {
                System.out.println(maxSum);
            } else {
                int s = 0, start = 0, end = 0, maxSoFar = a[0], minEnd = 0;

                int maxSumSoFar = 0;
                for (int i = start; i <= end; i++) {
                    maxSumSoFar += a[i];
                }
                System.out.println(maxSumSoFar);
            }
            k--;
        }
    }
}
