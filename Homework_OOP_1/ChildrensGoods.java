package Homework_OOP_1;

public class ChildrensGoods extends Product{
    private int minAge;
    private String hipoallergenic;

    protected ChildrensGoods(String name, int price, int quantity, String unit, int minAge,String hipoallergenic) {
        super(name, price, quantity,unit);
        this.minAge = minAge;
        this.hipoallergenic= hipoallergenic;
    }
    
    public int getMinAge() {
        return minAge;
    }

    public String getHipoallergenic() {
        return hipoallergenic;
    }
}
