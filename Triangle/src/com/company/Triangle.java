package com.company;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    private static double getVector(Point a, Point b) {
        return Math.sqrt(Math.pow((b.x - a.x), 2) + Math.pow((b.y - a.y), 2));
    }

    public double getArea() {
        double sideA = getVector(a, b);
        double sideC = getVector(c, b);
        double sideB = getVector(a, c);
        double per = (sideA + sideC + sideB) / 2;

        return Math.sqrt(per * (per - sideA) * (per - sideB) * (per - sideC));
    }
}
