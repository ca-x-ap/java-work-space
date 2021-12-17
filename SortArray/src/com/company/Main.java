package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] v = new int[] {6, 28, 1, 17};
        int[] v1 = new int[] {6, 28, 17, 1};
        int[] v2 = new int[] {1, 17, 6, 28};
        int[] v3 = new int[] {28, 6, 17, 1};
        int[] v4 = new int[] {28, 5, 11, 1, 44, 17, 8};

        System.out.println(Arrays.toString(getSort(v)));
        System.out.println(Arrays.toString(getSort(v1)));
        System.out.println(Arrays.toString(getSort(v2)));
        System.out.println(Arrays.toString(getSort(v3)));
        System.out.println(Arrays.toString(getSort(v4)));
    }

    public static int[] getSort(int[] v) {
        int maxIndexValue = 0;
        int max = v[0];
        int minIndexValue = 0;
        int min = v[0];

        for (int i = 0; i < v.length; i++) {
            if (v[i] > v[maxIndexValue]) {
                maxIndexValue = i;
                max = v[i];
            }
            if (v[i] < v[minIndexValue]) {
                minIndexValue = i;
                min = v[i];
            }
        }

        int tempValue;

        tempValue = v[0];
        v[0] = min;
        v[minIndexValue] = tempValue;

        maxIndexValue = v[minIndexValue] == max ? minIndexValue : maxIndexValue;
        tempValue = v[v.length - 1];
        v[v.length - 1] = max;
        v[maxIndexValue] = tempValue;

        return v;
    }
}
