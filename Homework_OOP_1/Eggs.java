package Homework_OOP_1;

public class Eggs extends Food{
    private int piecesPack;

    protected Eggs(String name, int price, int quantity, String unit, String date, int piecesPack) {
        super(name, price, quantity, unit, date);
        this.piecesPack = piecesPack;
    }

    public int getEggs() {
        return this.piecesPack;
    }

    public String toString() {
        return String.format("%s Количество в упаковке %d", getInfo(), getEggs());
    }
}
