package Homework_OOP_1;

public class Lemonade extends Drinks{

    protected Lemonade(String name, int price, int quantity, String unit, int volume) {
        super(name, price, quantity, unit, volume);
    }

    public String toString() {
        return String.format("%s Объём: %f", getInfo(), getVolume());
    }
    
}
