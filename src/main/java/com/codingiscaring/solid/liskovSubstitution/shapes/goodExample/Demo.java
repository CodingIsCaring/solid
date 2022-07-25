package com.codingiscaring.solid.liskovSubstitution.shapes.goodExample;

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

    public void calculateArea(Square s) {
        s.setLength(3);
        if (s.getArea() != 9) printError("area", s);
        if (s.getLength() != 3) printError("length", s);
    }

    private void printError(String errorIdentifer, Square s) {
        System.out.println("Unexpected value of "  + errorIdentifer +   " for instance of "  + s.getClass().getName());
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.calculateArea(new Rectangle());
        demo.calculateArea(new Square());
    }
}