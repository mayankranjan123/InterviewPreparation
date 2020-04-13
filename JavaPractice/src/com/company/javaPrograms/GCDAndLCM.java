package com.company.javaPrograms;

import java.util.Scanner;

public class GCDAndLCM {
    static int gcd(int m, int n) {
        if (m == 0)
            return  n;
        if (n == 0)
            return m;
        if (m == n)
            return m;
        if (m > n)
            return gcd(m-n, n);
        return gcd(m, n-m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 2 numbers to find LCM And HCF");
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        int gcd = gcd (m, n);
//        System.out.println("HCF or GCD : " + gcd);
//        System.out.println("LCM : " + (m * n) / gcd);
        System.out.println("Enter number of elements to find hcf and lcm for");
        int n = sc.nextInt();
        int a[] = new int[n];

        System.out.println("Enter elements");
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        int gcd = 0, lcm = a[0];
        for (int i = 1 ; i < n; i++) {
            //calculate GCD
            gcd = gcd(a[i], lcm);
            lcm = (a[i] * lcm) / gcd;
        }
        System.out.println("LCM and GCD are : " + lcm +  " and " + gcd);
    }
}
