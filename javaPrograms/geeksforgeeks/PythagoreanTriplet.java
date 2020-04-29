package com.company.javaPrograms.geeksforgeeks;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                int c = (a * a) + (b * b);
                if (Math.sqrt(c) == Math.ceil(Math.sqrt(c))) {
                    System.out.println(a + " " + b + " " + (int) Math.sqrt(c));
                }


//                for (int c = 1; c <= 10; c++) {
//                    if (((a*a) + (b*b)) == c*c) {
//                        System.out.println(a + " " + b + " " + c);
//                    }
//                }
            }
        }
    }
}
