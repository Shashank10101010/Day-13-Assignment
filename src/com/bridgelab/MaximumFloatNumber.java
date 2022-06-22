package com.bridgelab;

import java.util.Scanner;

public class MaximumFloatNumber {
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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three float Numbers ");
        System.out.println("The greatest float number is " + genericMax(sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
    }
}
