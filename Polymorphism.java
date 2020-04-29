package com.company;

public class Polymorphism {
    public void fun() {
        System.out.println("Parent");
    }

    public static void main(String[] args) {
        Polymorphism inherited = new Inherited();
        inherited.fun();
    }
}

 class Inherited extends Polymorphism {
    public void fun(int x) {

    }

    public void fun() {
        System.out.println("Child");
    }

}
