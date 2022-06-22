package com.bridgelab;

import java.util.Scanner;

public class FindingMaximum {
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
        System.out.println("Enter three integer Numbers ");
        System.out.println("Maximum number in these three numbers is " + genericMax(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        System.out.println("Enter three float Numbers ");
        System.out.println("The greatest float number is " + genericMax(sc.nextFloat(), sc.nextFloat(), sc.nextFloat()));
        System.out.println("Enter three string type values ");
        System.out.println("Maximum String is " + genericMax(sc.next(),sc.next(),sc.next()));
    }
}
