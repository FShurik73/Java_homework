package Homework_OOP_3.Figures;

import Homework_OOP_3.Figures.Base.Polygon;

public class Square extends Polygon{
    public Square(double a) {
        super(new double [] {a, a});
    }

    public double area() {
        return sides[0] * sides[1];
    }

    public String toString() {
        return String.format("Квадрат: Сторона: %.2f", sides[0]);
    } 
}
