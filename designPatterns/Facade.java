package com.company.designPatterns;

public class Facade {
    public static void main(String[] args) {
        Rectangle rc = new Rectangle();
        Circle c = new Circle();
        rc.draw();
        c.draw();
    }

    interface Shape {
        void draw();
    }


}
    class Rectangle implements Facade.Shape {
        @Override
        public void draw() {
            System.out.println("Rectangle");
        }
    }

    class Circle implements Facade.Shape {
        @Override
        public void draw() {
            System.out.println("Circle");
        }
    }
