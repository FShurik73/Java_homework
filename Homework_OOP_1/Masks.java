package Homework_OOP_1;

public class Masks extends HygieneItems{
    
    protected Masks(String name, int price, int quantity, String unit, int pieces) {
        super (name, price, quantity, unit, pieces);
    }
    
    public String toString() {
        return String.format("%s Лоличество в упаковке: %d", getInfo(), getPieces());
    }
}
