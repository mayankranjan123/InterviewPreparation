package com.company.javaPrograms;

import java.util.Scanner;

public class PowerFunction {

    static int pow(int x, int n) {
        if (n == 0)
            return 1;
        else if ((n % 2) == 0) {
            int y = pow(x, n / 2);
            return y * y;
        } else {
            return x * pow(x, n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and n");
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Answer: " + pow(x, n));
    }
}
