package Homework_OOP_1;

public class Milk extends Food {
    private double fatContent;

    protected Milk(String name, int price, int quantity, String unit, String date, double fatContent) {
        super(name, price, quantity, unit, date);
        this.fatContent = fatContent;
    }

    public double getMilk() {
        return this.fatContent;
    }

    public String toString() {
        return String.format("%s Срок годности: %s; Жирность: %f", getInfo(), getDate(), getMilk());
    }
}
