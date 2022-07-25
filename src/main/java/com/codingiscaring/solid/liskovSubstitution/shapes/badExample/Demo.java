package com.codingiscaring.solid.liskovSubstitution.shapes.badExample;

public class Demo {
    public void calculateArea(Rectangle r) {
        r.setHeight(2);
        r.setLength(3);
        if (r.getArea() != 6) printError("area", r);
        if (r.getLength() != 3) printError("length", r);
        if (r.getHeight() != 2) printError("breadth", r);
    }

    private void printError(String errorIdentifer, Rectangle r) {
        System.out.println("Unexpected value of "  + errorIdentifer +   " for instance of "  + r.getClass().getName());
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.calculateArea(new Rectangle());
        demo.calculateArea(new Square());
    }
}
