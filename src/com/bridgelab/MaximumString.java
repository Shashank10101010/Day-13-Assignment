package com.bridgelab;

import java.util.Scanner;

public class MaximumString {
    public static <T extends Comparable<T>> T genericMax(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three string type values ");
        System.out.println("Maximum of Apple, Peach, Banana is " + genericMax("Apple", "Peach", "Banana"));
    }
}
