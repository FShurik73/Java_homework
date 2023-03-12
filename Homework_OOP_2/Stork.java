package Homework_OOP_2;

public class Stork extends Bird implements BirdFly{

    public Stork(int height, int weight, String colorEye, int hightFly) {
        super(height, weight, colorEye, hightFly);
    }
    
    @Override
    public void toFly() {
        System.out.printf("Я летаю на высоте %d метров", super.getHeightFly());
    }

    @Override
    public void animalSound() {
        System.out.println("Курлыкает");
        
    }

    @Override
    public String toString() {
        return String.format("Аист: %s", super.toString());
    }
}
