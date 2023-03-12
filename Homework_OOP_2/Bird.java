package Homework_OOP_2;

public abstract class Bird extends Animal {
    protected int hightFly;
    
    protected Bird(int height, int weight, String colorEye, int hightFly) {
        super(height, weight, colorEye);
        this.hightFly = hightFly;
    }

    public int getHeightFly() {
        return this.hightFly;
    }
     
    public abstract void toFly();
}
