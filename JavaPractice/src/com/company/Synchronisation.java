package com.company;

import java.util.Scanner;

class Account {
    int bal;
    public Account(int bal){
        this.bal = bal;
    }
    public boolean isSuff(int wAmount) {
        if (this.bal < wAmount) {
            return false;
        }
        return true;
    }
    public int getBal() {
        return bal;
    }

    public void withdraw(int wAmount) {
        this.bal = bal - wAmount;
    }
}

class Customer implements Runnable {
    Account account;
    String name;
    public Customer(String name, Account account) {
        this.account = account;
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (account) {
        System.out.println("Hi! " + name + "Enter amount to withdraw");
        Scanner sc = new Scanner(System.in);
        int wAmount = sc.nextInt();
            if (account.isSuff(wAmount)) {
                account.withdraw(wAmount);
                System.out.println("Amount withdrawn: " + wAmount + "balance: " + account.bal);
            } else {
                System.out.println("Not sufficient funds!");
            }
        }
    }
}

public class Synchronisation {
    public static void main(String[] args) {
        Account account = new Account(1000);
        Customer c1 = new Customer("Mayank", account);
        Customer c2 = new Customer("Ranjan", account);
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
