package Homework_OOP_1;

public class Diapers extends ChildrensGoods{
    private int size;
    private int minWeight;
    private int maxWeight;
    private String type;

    protected Diapers(String name, int price, int quantity, String unit, int minAge, String hipoallergenic, int size, int minWeight, int maxWeight, String type) {
        super(name, price, quantity, unit, minAge, hipoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    public int getSize() {
        return this.size;
    }

    public int getminWeight() {
        return this.minWeight;
    }

    public int getmaxWeight() {
        return this.maxWeight;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return String.format("%s Минимальный возраст: %d; Гипоаллергенность: %s; Размер: %d; Мин.вес: %d; Макс.вес: %d; Тип: %s", getInfo(),
         getMinAge(), getHipoallergenic(), getSize(), getminWeight(), getmaxWeight(), getType());
    }
}
