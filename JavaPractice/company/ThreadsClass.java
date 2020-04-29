package com.company;

public class ThreadsClass extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Heyyy");
    }

    public static void main(String[] args) {
        ThreadsClass threadsClass = new ThreadsClass();
        threadsClass.run();
    }
}
