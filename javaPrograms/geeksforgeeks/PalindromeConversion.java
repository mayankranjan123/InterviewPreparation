package com.company.javaPrograms.geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeConversion {
    int t[][] = new int[51][41];

    static int lcs(char [] x, char[] y, int m, int n, int t[][]) {
        if (m == 0 || n == 0)
            t[m][n] =  0;
        else if (t[m][n] != -1)
            return t[m][n];
        else if (x[m - 1] == y[n - 1]) {
            return 1 + lcs(x, y, m-1, n-1, t);
        } else {
            return Math.max(lcs(x, y, m-1, n, t), lcs(x, y, m, n-1, t));
        }
        return t[m][n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(sc.readLine());
        while (k != 0) {
            String s = sc.readLine();
            char x[] = s.toCharArray();
            StringBuffer sbf = new StringBuffer(s);
            char y[] = sbf.reverse().toString().toCharArray();
            int t[][] = new int[51][41];

            for (int i = 0; i < 51; i++) {
                for (int j = 0; j < 41; j++)
                    t[i][j] = -1;
            }
            int lcs = lcs(x, y, s.length(), s.length(), new int[51][41]);
            System.out.println(s.length() - lcs);
            k--;
        }
    }
}
