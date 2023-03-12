package Homework_OOP_2;

public abstract class Animal {
    private int height;
    private int weight;
    private String colorEye;

    protected Animal(int height, int weight, String colorEye) {
        this.height = height;
        this.weight = weight;
        this.colorEye = colorEye;
    }

    public abstract void animalSound();

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getColorEye() {
        return this.colorEye;
    }

    @Override
    public String toString() {
        return String.format("Рост: %d; Вес: %d; Цвет глаз: %s", getHeight(), getWeight(), getColorEye());
    }
}
