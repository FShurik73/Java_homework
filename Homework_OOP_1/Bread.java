package Homework_OOP_1;

public class Bread extends Food{
    private String typeFlour;

    protected Bread(String name, int price, int quantity, String unit, String typeFlour) {
        super(name, price, quantity, unit, typeFlour);
        this.typeFlour = typeFlour;
    }

    public String getBread() {
        return this.typeFlour;
    }
     public String toString() {
        return String.format("%s Тип муки: %s", getInfo(), getBread());
     }
}
