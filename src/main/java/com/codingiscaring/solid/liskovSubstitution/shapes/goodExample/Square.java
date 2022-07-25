package com.codingiscaring.solid.liskovSubstitution.shapes.goodExample;


public class Square implements Length {

    private int length;

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getLength() {
        return this.length;
    }

    public int getArea() {
        return this.length * this.length;
    }
}
