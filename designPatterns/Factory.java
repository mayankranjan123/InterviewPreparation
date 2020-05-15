package com.company.designPatterns;

public class Factory {
    public static void main(String[] args) {
        ShapeFactory s = new ShapeFactory();
        Facade.Shape s1 = s.getShape("circle");
        s1.draw();
        Facade.Shape s2 = s.getShape("rectangle");
        s2.draw();
    }

}

    class ShapeFactory {
        public Facade.Shape getShape(String shape) {
            if (shape.equalsIgnoreCase("circle"))
                return new Circle();
            if (shape.equalsIgnoreCase("rectangle"))
                return new Rectangle();
            return null;
        }
    }
