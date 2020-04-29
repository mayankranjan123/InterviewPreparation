package com.company.javaPrograms.geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {
    public static void main (String[] args) throws IOException {
        //code
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(sc.readLine());

        while (k != 0) {
            String s = sc.readLine();

            String t [] = s.split("\\.");

            for (int i = t.length - 1; i >=0; i--) {
                System.out.print(t[i]);
                if (i != 0)
                    System.out.print(".");
            }
            k--;
            System.out.println();
        }
    }
}
