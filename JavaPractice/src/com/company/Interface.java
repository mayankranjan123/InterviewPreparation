package com.company;

public interface Interface {
    public void hello();
}

 class InterfaceInherit implements Interface{

     @Override
     public void hello() {
         System.out.println("Hello");
     }

     public void test() {
         System.out.println("test");
     }

     public static void main(String[] args) {
         Interface interfaceInherit = new InterfaceInherit();
         interfaceInherit.hello();
        // interfaceInherit.test(); not allowed, refer to Abstract class comment by you
     }
}
