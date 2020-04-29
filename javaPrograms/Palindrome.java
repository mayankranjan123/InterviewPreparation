package com.company.javaPrograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check palindrome");
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        char rev[] = new char[s.length()];
        int j = 0;
        for (int i = s.length() - 1 ; i >= 0 ; i--) {
            rev[j] = ch[i];
            if (rev [j] != ch[j]) {
                System.out.println("Not Palindrome");
                return;
            }
            j++;
        }
        System.out.println("Palindrome");
//        StringBuffer sb = new StringBuffer();
//        sb.append(s);
//        sb = sb.reverse();
//        if (rev.toString().equals(s)) {
//            System.out.println("Palindrome");
//            return;
//        }
//        System.out.println("Not Palindrome");
    }
}
