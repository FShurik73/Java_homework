package Homework_OOP_2;

public class Dog extends HomeAnimal {
    private final String training;

    protected Dog(String nickname, String breed, String vaccination, String coatColor, String dateBirthday, int height,
            int weight, String colorEye, String training) {
        super(nickname, breed, vaccination, coatColor, dateBirthday, height, weight, colorEye);
        this.training = training;
    }

    public String getTraining() {
        return this.training;
    }

    public void trainDog() {
        System.out.println("Идет дрессировка");
    }

    @Override
    public void showAffection() {
        System.out.println("Мне нужна твоя ласка");
    }

    @Override
    public void animalSound() {
        System.out.println("Гавввввв");
    }

    @Override
    public String toString() {
        return String.format("Собака: %s; Дрессировка: %s", super.toString(), getTraining());
    }
}
