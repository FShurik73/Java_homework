package Homework_OOP_1;

public class Nipple extends ChildrensGoods{

    protected Nipple(String name, int price, int quantity, String unit, int minAge, String hypoallergrnic) {
        super(name, price, quantity, unit, minAge, hypoallergrnic);
    }

    public String toString() {
        return String.format("%s Мин.возраст: %d; Гипоаллергенность: %s", getInfo(), getMinAge(), getHipoallergenic());
    }
    
}
