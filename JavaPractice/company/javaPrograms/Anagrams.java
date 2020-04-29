package com.company.javaPrograms;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings to check anagram");
        String s = sc.nextLine();
        String t = sc.nextLine();
        char sArray[] = s.toCharArray();
        Arrays.sort(sArray);
        char tArray[] = t.toCharArray();
        Arrays.sort(tArray);
        if (String.valueOf(sArray).equals(String.valueOf(tArray))) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
