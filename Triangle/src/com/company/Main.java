package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(
                new Point(0d, 0d),
                new Point(2d, 0d),
                new Point(0d, 2d)
                );
        System.out.println(triangle.getArea());

        Triangle triangle1 = new Triangle(
                new Point(-5d, 3d),
                new Point(4d, -7d),
                new Point(3d,14d)
        );
        System.out.println(triangle1.getArea());
    }
}
