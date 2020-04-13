package com.company.javaPrograms;

import java.util.Scanner;

public class Kmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string and pattern");
        String s = sc.nextLine();
        String pt = sc.nextLine();
        char t [] = s.toCharArray();
        char p [] = pt.toCharArray();
        int m = s.length();
        int n = pt.length();
        // initialize fail function to 0
        int fail [] = initializeArray(n);

        // create fail function
        fail = createFailFunction(p, fail, n);
        int matchIndex = kmp(t, p, fail, m, n);
        System.out.println("Array found at index: " + matchIndex);
    }

    private static int kmp(char[] t, char[] p, int[] fail, int m, int n) {
        int i = 0, j = 0;
        while (i < m) {
            if (t[i] == p[j]) {
                if (j == n - 1) {
                    return i - j;
                }
                i ++;
                j ++;
            } else {
                if (j > 0) {
                    j = fail[j - 1];
                } else {
                    i ++;
                }
            }
        }
        return -1;
    }

    private static int[] createFailFunction(char[] p, int[] fail, int n) {
        int j = 0, i = 1;
        fail[0] = 0;

        while (i < n) {
            if (p[i] == p[j]) {
                fail[i] = j + 1;
                i ++;
                j ++;
            } else {
                if (j > 0) {
                    j = fail[j - 1];
                } else {
                    fail[i] = 0;
                    i ++;
                }
            }
        }
        return fail;
    }

    private static int[] initializeArray( int n) {
        int fail [] = new int[n];
        for (int i = 0; i < n; i++) {
            fail [i] = 0;
        }
        return fail;
    }
}
