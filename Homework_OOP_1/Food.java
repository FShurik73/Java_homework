package Homework_OOP_1;

public class Food extends Product{
    private String date;

    protected Food(String name, int price, int quantity, String unit, String date) {
        super(name, price, quantity,unit);
        this.date = date;
    }

    public String getDate() {
        return this.date;
    }
}
