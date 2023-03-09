package Homework_OOP_1;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private String unit;

    protected Product(String name, int price, int quantity,String unit) {
        this.name = name;
        this.price = price;
        this.quantity =quantity;
        this.unit = unit;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getUnit() {
        return this.unit;
    }

    public String getInfo() {
        return String.format("Название: %s; Цена: %d; Количество: %d; Ед.измерения: %s;",getName(), getPrice(), getQuantity(), getUnit());
    }
}
