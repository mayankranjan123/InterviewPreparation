package com.company;

public abstract class Abstract {

    void fun() {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        Abstract ab = new InheritAbstract();
        ab.fun();
       // ab.test(); can only access parent class method bcoz of parent's reference variable
    }
}

class InheritAbstract extends Abstract {
    @Override
    void fun() {
        System.out.println("Parent");
        super.fun();
    }

    void test() {
        System.out.println("Child");
    }
}
