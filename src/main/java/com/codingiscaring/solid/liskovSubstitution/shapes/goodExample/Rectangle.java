package com.codingiscaring.solid.liskovSubstitution.shapes.goodExample;

public class Rectangle implements Length, Height {

    private int length;
    private int height;

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return this.length * this.height;
    }
}
