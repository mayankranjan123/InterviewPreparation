package com.company.javaPrograms;

import java.util.Scanner;

public class MinimumJumps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of array elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        int minJump[] = new int[n];
        int jumpPath[] = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            minJump[i] = 11111;
        }

        minJump[0] = 0; // min jump to reach index 0 is 0
        jumpPath[0] = -1; // start path

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (j + a[j] >= i) {
                    minJump[i] = Math.min(minJump[i], 1 + minJump[j]);
                    jumpPath[i] = (minJump[i] < (1 + minJump[j])) ? i : j;
                }
            }
        }

        System.out.println("Min Jump array:");
        for (int i = 0; i < n; i++) {
            System.out.print(minJump[i]);
            System.out.print(" ");
        }

        System.out.println("Minimum jump : " + minJump[n - 1]);
        System.out.print("Path for minJump: ");
        for (int i = 0; i < n; i++) {
            System.out.print(jumpPath[i]);
            System.out.print(" ");
        }
        System.out.print(n-1 + " ");


    }
}
