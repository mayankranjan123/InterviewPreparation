package com.company;

public class Constructors {
    static int y;
    static {
        y = 7;
        System.out.println(y);
    }

    int x;
    {
        x = 6;
        y=8;
        System.out.println(x);
        System.out.println(y);
    }

    public Constructors(int x) {
        System.out.println("Constructor 2 executed, x = " + x);
    }


    public Constructors() {
        this(10);
        System.out.println("Constructor 1 executed");
    }

    public static void main(String[] args) {
        ConstructorInheritance c = new ConstructorInheritance();
    }
}
 class ConstructorInheritance extends Constructors {
    public ConstructorInheritance() {
        //constructor chaining , will call parent class constructor first
        //super() is predefined here by compiler
        System.out.println("Class2 constructor called");
     }
 }
