package Homework_OOP_6.models.animals.wilds;

import java.util.Date;

import Homework_OOP_6.models.animals.base.Animal;

public abstract class WildAnimal extends Animal {
    private String habitat;
    private Date foundDate;

    protected WildAnimal(double height, double weight, String eyeColor, String habitat, Date foundDate) {
        super(height, weight, eyeColor);
        this.habitat = habitat;
        this.foundDate = foundDate;
    }

    public String getHabitat() {
        return this.habitat;
    }

    public Date getFoundDate() {
        return this.foundDate;
    }

    @Override
    public String toString() {
        return String.format(
            "%s, Среда обитания: %s, Дата нахождения: %s",
            super.toString(), this.getHabitat(), this.getFoundDate()
        );
    }
}
