package com.company.javaPrograms.geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCSS {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(sc.readLine());

        while (k != 0) {
            String s = sc.readLine();
            String x = sc.readLine();
            String y = sc.readLine();
            System.out.println(lcss(x.toCharArray(), y.toCharArray(), x.length(), y.length()));
            k--;
        }
    }

    private static int lcss(char[] x, char[] y, int m, int n) {
        int t[][] = new int[m + 1][n + 1];
        int max = 0;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++)
                if (i == 0 || j == 0)
                t[i][j] = 0;
                else if (x[i - 1] == y[j - 1]) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                    max = Integer.max(max, t[i][j]);
                }
                else
                  t[i][j] = 0;
        }
        return max;
    }
}
