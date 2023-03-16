package Homework_OOP_3.Figures;

import Homework_OOP_3.Figures.Base.Polygon;

public class Triangle extends Polygon {
    public Triangle(double a, double b, double c) {
        super(new double[] {a, b, c} );
    }

    public double area() {
        double p = perimeter() / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }

    public String toString() {
        return String.format("Треугольник: Сторона a: %.2f; Сторона b: %.2f; Сторона c: %.2f", sides[0], sides[1], sides[2]);
    }
}
