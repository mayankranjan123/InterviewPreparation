package com.company.javaPrograms;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find permutation");
        String s = sc.nextLine();
        if (s == null || s.length() == 0) {
            System.out.println("Empty or null string");
            return;
        }
        permute("", s);
    }

    private static void permute(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < remaining.length(); i++) {
            permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, remaining.length()));
        }

    }
}
