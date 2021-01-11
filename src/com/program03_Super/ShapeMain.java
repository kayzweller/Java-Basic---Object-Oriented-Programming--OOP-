package com.program03_Super;

public class ShapeMain {
    public static void main(String[] args) {
        //

        var shape = new Shape();
        System.out.println(shape.getCorner());              // parent method

        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());          // method overriding
        System.out.println(rectangle.getParentCorner());    // super keyword
    }
}
