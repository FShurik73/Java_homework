package Homework_OOP_3.Figures.Base;

public abstract class Polygon extends Figure implements Perimeterable {
    protected double[] sides;

    protected Polygon(double[] sides) {
        this.sides = sides;
    }

    public double perimeter() {
        Double sum = (double) 0;
        for (double side : sides)
            sum += side;
        return sum;
        
    }
    

    @Override
    public abstract double area();
}
