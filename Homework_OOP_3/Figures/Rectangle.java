package Homework_OOP_3.Figures;

import Homework_OOP_3.Figures.Base.Polygon;

public class Rectangle extends Polygon {
    
    public Rectangle(double a, double b) {
        super(new double [] {a, b});
    }

    public double area() {
        return sides[0] * sides[1];
    }

    public String toString() {
        return String.format("Прямоугольник: Сторона а: %.2f Сторона b: %.2f",sides[0], sides[1]);
    }

    
}
