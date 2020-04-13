package com.company.javaPrograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        //eg -> 121- 121 basically reverse a number
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number to check palindrome");
        n = sc.nextInt();

        int temp = n, rev = 0, rem = 0;
        while (temp != 0) {
            rem = temp % 10;
            temp = temp / 10;
            rev = (rev * 10) + rem;
        }
        if (rev != n) {
            System.out.println("Not Palindrome : " + rev);
            return;
        }
        System.out.println("Palindrome: " + rev);

    }
}
