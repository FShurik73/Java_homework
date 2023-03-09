package Homework_OOP_1;

public class ToiletPaper extends HygieneItems{
    private int layers;

    protected ToiletPaper(String name, int price, int quantity, String unit, int layers) {
        super(name, price, quantity, unit, layers);
        this.layers = layers;
    }

    public int getToiletPaper() {
        return this.layers;
    }

    public String toString() {
        return String.format("%s Кол-во слоев: %d", getInfo(), getToiletPaper());
    }
}
