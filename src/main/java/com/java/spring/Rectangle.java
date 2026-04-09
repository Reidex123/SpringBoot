package com.java.spring;

public class Rectangle implements Shape {

    @SuppressWarnings("FieldMayBeFinal")
    private int leng;
    @SuppressWarnings("FieldMayBeFinal")
    private int bred;

    public Rectangle(int leng, int bred) {
        this.leng = leng;
        this.bred = bred;
    }

    @Override
    public double area() {
        return leng * bred;
    }

    @Override
    public double perimeter() {
        return leng * 2 + bred * 2;
    }

    public void string(java.util.List<Shape> shape) {
        System.out.println(((Shape) shape).area());
    }
}
