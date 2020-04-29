package com.company.javaPrograms;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int n, sum = 0, rem = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check armstrong");
         n = sc.nextInt();
        int temp = n, count = 0;
         while (temp != 0) {
            temp = temp / 10;
            count ++;
         }
         System.out.println("No. of digits: " + count);
         temp = n;

         while (temp != 0) {
             rem = temp % 10;
             sum += Math.pow(rem, count);
             temp = temp / 10;
         }
         if (sum != n) {
             System.out.println("Not armstrong");
             return;
         }
        System.out.println("ArmStrong number");
    }

}
