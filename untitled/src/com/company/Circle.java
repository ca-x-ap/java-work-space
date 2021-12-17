package com.company;

public class Circle extends Shape {
    private int radius;

    public Circle(String shapeName) {
        super(shapeName);
    }

    public Circle(String shapeName, int radius) {
        super(shapeName);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

