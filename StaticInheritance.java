package com.company;

public class StaticInheritance {

    static int x=5;
    public static void fun() {
        System.out.println("Parent");
    }
    public static void main(String[] args) {
        ChildStatic.fun();
    }
}

class ChildStatic extends StaticInheritance {
    public static void  fun() {
        x=7;
        System.out.println(x); // x=7
    }
}
