package Homework_OOP_3.Figures;

//import javax.lang.model.util.ElementScanner14;

import Homework_OOP_3.Figures.Base.Figure;
import Homework_OOP_3.Figures.Base.Lengthable;

public class Circle extends Figure implements Lengthable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double lenght() {
        return 2 * Math.PI * getRadius();
    }

    public String toString() {
        return String.format("Круг: Радиус %.2f", getRadius());
    }

    @Override
    public double length() {
        if (radius <= 0) {
            System.out.println("Радиус должен быть больше ноля");
        }
        return radius;
    }

}
