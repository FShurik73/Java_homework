package Homework_OOP_6.models.animals.pets;

import java.util.Date;
import java.util.List;

public class Cat extends Pet{
    private boolean woolly;

    public Cat(double height, double weight, String eyeColor, String name, String breed, List<String> vaccinations, String furColor, Date birthDate, boolean woolly) {
        super(height, weight, eyeColor, name, breed, vaccinations, furColor, birthDate);
        this.woolly = woolly;
    }
    
    public Cat(double height, double weight, String eyeColor, String name, String breed, List<String> vaccinations, String furColor, Date birthDate) {
        super(height, weight, eyeColor, name, breed, vaccinations, furColor, birthDate);
        this.woolly = false;
    }

    public boolean isWoolly() {
        return this.woolly;
    }

    @Override
    public String sound() {
        return "МЯу-мяу!";
    }

    @Override
    public String toString() {
        return String.format("Кот (%s, шерстяой: %b)", super.toString(), this.isWoolly());
    }
}