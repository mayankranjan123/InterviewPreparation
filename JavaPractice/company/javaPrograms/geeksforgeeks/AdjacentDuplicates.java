package com.company.javaPrograms.geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdjacentDuplicates {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(sc.readLine());
        while(k !=0) {
            String s = sc.readLine();
            char x[] = s.toCharArray();
            String y = "" + x[s.length() -1];
            System.out.println(new StringBuffer(removeAdjDuplicates(x, y, s.length())).reverse());
            k--;
        }
    }

    private static String removeAdjDuplicates(char[] x, String y, int m) {
        if (m == 0 || m == 1)
            return y;
         else if (x[m -1] != x[m -2]) {
            y = y + x[m - 2];
         }
        return removeAdjDuplicates(x, y, m -1);
    }
}
