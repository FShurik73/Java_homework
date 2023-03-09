package Homework_OOP_1;

public class HygieneItems extends Product{
    private int pieces;

    protected HygieneItems(String name, int price, int quantity, String unit, int pieces) {
        super (name, price, quantity, unit);
        this.pieces = pieces;
    }

    public int getPieces() {
        return pieces;
    }
}
