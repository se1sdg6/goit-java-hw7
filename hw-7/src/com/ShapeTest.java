package com;

public class ShapeTest {
    public void printShapeName(Shape shape) {
        System.out.println(shape.getName());
    }

    public static void main(String[] args) {
        ShapeTest shapeTest = new ShapeTest();

        shapeTest.printShapeName(new Circle("Circle1"));
        shapeTest.printShapeName(new Circle("Circle2"));
        shapeTest.printShapeName(new Trapezoid("Trapezoid"));
        shapeTest.printShapeName(new Triangle("Triangle"));
        shapeTest.printShapeName(new Quad("Quad"));
        shapeTest.printShapeName(new Rectangle("Rectangle"));
        shapeTest.printShapeName(new Parallelogram("Parallelogram"));
    }
}
