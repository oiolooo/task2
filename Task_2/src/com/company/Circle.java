package com.company;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius="+radius+", which is a subclass of"+" "+super.toString();
    }




}
