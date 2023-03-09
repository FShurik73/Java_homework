package Homework_OOP_1;

public class Drinks extends Product {
    private double volume;

    protected Drinks(String name, int price, int quantity, String unit, double volume) {
        super(name, price, quantity, unit);
        this.volume = volume;
    }

    public double getVolume() {
        return this.volume;
    }
}
