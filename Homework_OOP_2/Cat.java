package Homework_OOP_2;

public class Cat extends HomeAnimal{
    private final String wool;

    public Cat(String nickname, String breed, String vaccination, String coatColor, String dateBirthday, int height,
            int weight, String colorEye, String wool) {
        super(nickname, breed, vaccination, coatColor, dateBirthday, height, weight, colorEye);
        this.wool = wool;
    }

    public String getWool() {
        return this.wool;
    }

    @Override
    public void showAffection() {
        System.out.println("Кошка хочет ласки");
    }

    @Override
    public void animalSound() {
        System.out.println("Мяу!");
    }

    @Override
    public String toString() {
        return String.format("Кот: %s; Наличие шерсти: %s", super.toString(), getWool());
    }
}
