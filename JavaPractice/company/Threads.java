package com.company;

public class Threads implements Runnable {

    @Override
    public void run() {
        for (int i=0;i<10;i++)
        System.out.println("Hey there 1");
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Threads());
        Thread thread2 = new Thread(new InheritThread());
        thread1.start();
        thread2.start();
        thread2.setPriority(10);
    }
}

class InheritThread implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++)
            System.out.println("hello 2");
    }
}
