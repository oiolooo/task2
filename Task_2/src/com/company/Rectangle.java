package com.company;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle() {
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length) {
        setLength(length);
        setWidth(width);
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(double width, double length) {
        return width * length;
    }

    public double getPerimeter(double width,double length) {
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+width+" and length="+length+", which is a subclass of"+" "+super.toString();

    }






}
