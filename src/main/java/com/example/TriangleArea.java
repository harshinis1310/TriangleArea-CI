package com.example;

public class TriangleArea {

    public static double calculateArea(double base, double height) {
        if (base < 0 || height < 0) {
            throw new IllegalArgumentException(
                "Base and height cannot be negative"
            );
        }

        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        double base = 10;
        double height = 5;

        double area = calculateArea(base, height);

        System.out.println("Base: " + base);
        System.out.println("Height: " + height);
        System.out.println("Area of triangle: " + area);
    }
}