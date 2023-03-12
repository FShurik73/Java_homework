package Homework_OOP_2;

public class Chicken extends Bird implements BirdFly {

    protected Chicken(int height, int weight, String colorEye, int hightFly) {
        super(height, weight, colorEye, hightFly);
    }

    @Override
    public void toFly() {
        System.out.printf("Я летаю на высоте %d метра", getHeightFly());
    }

    @Override
    public void animalSound() {
        System.out.println("Ко-ко-ко");
    }

    @Override
    public String toString() {
        return String.format("Курица: %s", super.toString());
    }

}
