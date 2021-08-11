package com.company;

public class Main {

    public static void main(String[] args) {
        Shape shape=new Shape();
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        Square square=new Square();
        System.out.println("--------------------OUTPUT-------------------");

        System.out.println("1) "+shape.toString());
        System.out.println("2) "+circle.toString());
        System.out.println("3) "+rectangle.toString());
        System.out.println("4) "+square.toString());
        System.out.println("-------------------OUTPUT--------------------");


    }
}
