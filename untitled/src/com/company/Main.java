package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//        Shape shapeA = new Shape("shapeA");
//        Object shapeB = new Shape("shapeB");
//
//        System.out.println(shapeA.getShapeName());
//        System.out.println(((Shape)shapeB).getShapeName());
//
//        Circle circle = new Circle("radius", 0);
//        Object sCircle = new Circle("sRadius", 0);
//
//        System.out.println(circle.getClass());
//        System.out.println(sCircle.getClass());

        RGB rgb = new RGB(123, 123,321);
        GrayScale grayScale = new GrayScale(321);

        ArrayList<Color> colors = new ArrayList<>();

        colors.add(rgb);
        colors.add(grayScale);

//        for (int i = 0; i < colors.size(); i++) {
//            System.out.println(colors.get(i).toString());
//            System.out.println(colors.get(i).toRGB());
//        }

//        for (Color color: colors) {
//            System.out.println(color.toString());
//            System.out.println(color.toRGB());
//        }

//        colors.stream();

//        List<Integer> arr = new ArrayList.
//                asList(1, 2, 3, 4, 5, 4);

//        System.out.println(arr.stream().mapToInt(Integer::intValue).sum());

//        arr.stream().filter(item -> item.equals(4));
//        arr.stream().mapToInt(Integer::intValue).
//        arr.removeIf(item -> item.equals(4));
//        ArrayList<Integer> arr2 = new ArrayList<>();
//        arr2.add(2);
//        arr2.add(3);
//        arr2.add(1);
//        arr2.add(1);
//
//        arr2.removeIf(item -> item.equals(1));
//        System.out.println(arr2);

    }
}
