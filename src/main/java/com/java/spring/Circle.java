package com.java.spring;

public class Circle implements Shape {

    @SuppressWarnings("FieldMayBeFinal")
    private double pie = Math.PI;
    @SuppressWarnings("FieldMayBeFinal")
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return (int) 2*this.pie;
    }

    @Override
    public double perimeter() {
        return (int) 2 * this.pie * this.radius;
    }

    public void string(java.util.List<Shape> shape) {
        System.out.println(((Shape) shape).area());
    }
}
