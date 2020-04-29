package com.company;

public class StaticInitializationBlock {
    //Instance Initialization Block
    int x;

    {
        x=x+1;
    }

    static int y = 3;
     static int b = 0 ; //b=0
    static double a; //0.0
    int d;
     static {
         y = 5;
     }

     static {
         y = 7;
         a= a+1;
     }

     int fun() {
         b=b+1;
         return b;
     }



    public static void main(String[] args) {
	// write your code here
      //  StaticInitializationBlock sib = new StaticInitializationBlock();
        //System.out.println(sib.x);
        System.out.println(StaticInitializationBlock.y);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.a);
        StaticInitializationBlock sib = new StaticInitializationBlock();
        System.out.println(sib.d + 1);
        System.out.println(sib.x);
        System.out.println(sib.fun());
    }
}
