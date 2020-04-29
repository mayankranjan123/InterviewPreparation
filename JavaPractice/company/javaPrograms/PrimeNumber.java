package com.company.javaPrograms;

import java.util.Scanner;

public class PrimeNumber {
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n ; i++) {
            if ((n % i) == 0)
                return false;
        }
        return true;
    }

    static int[] isPrimeSieveOfEratosthenes(int n) {
        int primes[] = new int[n + 1];
        //Initialize 0 and 1 as 0 because they are not prime numbers
        primes[0] = primes[1] = 0;

        //Now Assume all other numbers till n is prime
        for (int i = 2 ; i <= n ; i++) {
            primes[i] = 1;
        }

        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (primes[i] == 1) {
                for (int j = 2; (i*j) <= n ; j++) {
                    primes[i*j] = 0;
                }
            }
        }
        return primes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check prime");
        int n = sc.nextInt();
       // System.out.println("Is prime: " + isPrime(n));
        int primes[] = isPrimeSieveOfEratosthenes(n);
        if (primes[n] == 1) {
            System.out.println("Prime number:");
        } else {
            System.out.println("Not prime: ");
        }

        System.out.println("Array elements are: ");
        for (int i = 0 ; i <= n ; i++) {
            System.out.println("Number: " + i + ", isPrime: " + ((primes[i] == 1) ? true : false));
        }
    }
}