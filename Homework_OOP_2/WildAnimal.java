package Homework_OOP_2;

public abstract class WildAnimal extends Animal{
    private String habitat;
    private String date_of_finding;

    protected WildAnimal(int height, int weight, String colorEye, String habitat, String date_of_finding) {
        super(height, weight, colorEye);
        this.habitat = habitat;
        this.date_of_finding = date_of_finding;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public String getDateTreaning() {
        return this.date_of_finding;
    }

    @Override
    public abstract void animalSound();

    @Override
    public String toString() {
        return String.format("Место обитания: %s; Дата нахождения: %s; %s", getHabitat(), getDateTreaning(), super.toString());
    }
}
