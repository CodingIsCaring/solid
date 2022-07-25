package com.codingiscaring.solid.liskovSubstitution.shapes.badExample;

public class Square extends Rectangle {

    @Override
    public void setHeight(int breadth) {
        super.setHeight(breadth);
        super.setLength(breadth);
    }
    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setHeight(length);
    }
}
